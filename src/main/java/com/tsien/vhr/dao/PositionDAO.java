package com.tsien.vhr.dao;

import com.tsien.vhr.model.Position;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface PositionDAO {

    int deleteByPrimaryKey(Long positionId);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Long positionId);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    /**
     * 查询所有职位
     *
     * @return positions
     */
    List<Position> listPositions();
}