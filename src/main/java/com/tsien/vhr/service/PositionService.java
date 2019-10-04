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
}
