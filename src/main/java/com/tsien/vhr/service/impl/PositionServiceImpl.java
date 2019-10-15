package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.PositionDAO;
import com.tsien.vhr.model.Position;
import com.tsien.vhr.service.PositionService;
import com.tsien.vhr.util.ServerResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/4 0004 23:09
 */

@Service
public class PositionServiceImpl implements PositionService {

    @Resource
    private PositionDAO positionDAO;

    @Override
    public ServerResponse<List<Position>> listPositions() {
        return ServerResponse.ok(positionDAO.listPositions());
    }

    @Override
    public ServerResponse addPosition(String positionName) {

        Position position = positionDAO.getPositionByPositionName(positionName);
        if (position != null) {
            return ServerResponse.error("职位名称已存在，不能重复插入");
        }

        position = new Position();
        position.setPositionName(positionName);
        position.setDeleted(false);

        int resultCount = positionDAO.insertSelective(position);

        if (resultCount > 0) {
            return ServerResponse.ok("职位插入成功");
        }

        return ServerResponse.error("职位插入失败");

    }

    @Override
    public ServerResponse deletePositionsByIds(String ids) {

        String[] positionIdArray = ids.split(",");

        int resultCount = positionDAO.deletePositionsByIds(positionIdArray);

        if (resultCount == positionIdArray.length) {
            return ServerResponse.ok("职位删除成功");
        }

        if (resultCount > 0) {
            return ServerResponse.ok("批量删除了部分职位，部分未删除成功");
        }

        return ServerResponse.error("删除职位失败");
    }

    @Override
    public ServerResponse updatePositionById(Long positionId, String positionName) {

        if (positionId == null || StringUtils.isBlank(positionName)) {
            return ServerResponse.error("职位名称和ID不能为空");
        }

        Position position = positionDAO.getPositionByPositionName(positionName);
        if (position != null) {
            return ServerResponse.error("职位名称已存在，无法修改");
        }

        position = new Position();
        position.setPositionId(positionId);
        position.setPositionName(positionName);

        int resultCount = positionDAO.updateByPrimaryKeySelective(position);

        if (resultCount > 0) {
            return ServerResponse.ok("职位更新成功");
        }

        return ServerResponse.error("职位更新失败");
    }
}
