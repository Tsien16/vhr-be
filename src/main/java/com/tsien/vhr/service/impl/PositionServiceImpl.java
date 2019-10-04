package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.PositionDAO;
import com.tsien.vhr.model.Position;
import com.tsien.vhr.service.PositionService;
import com.tsien.vhr.util.ServerResponse;
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
}
