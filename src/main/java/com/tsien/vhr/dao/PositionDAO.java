package com.tsien.vhr.dao;

import com.tsien.vhr.model.Position;

public interface PositionDAO {
    int deleteByPrimaryKey(Long positionId);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Long positionId);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}