package com.tsien.vhr.service;

import com.tsien.vhr.model.Position;
import com.tsien.vhr.util.ServerResponse;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/4 0004 23:08
 */

public interface PositionService {

    /**
     * 查询所有职位
     *
     * @return positions
     */
    ServerResponse<List<Position>> listPositions();

    /**
     * 增加职位
     *
     * @param positionName positionName
     * @return 结果
     */
    ServerResponse addPosition(String positionName);

    /**
     * 根据ids删除职位
     *
     * @param ids ids
     * @return 删除的结果
     */
    ServerResponse deletePositionsByIds(String ids);

    /**
     * 根据职位ID更新职位名称
     *
     * @param positionId   positionId
     * @param positionName positionName
     * @return 更新的结果
     */
    ServerResponse updatePositionById(Long positionId, String positionName);
}
