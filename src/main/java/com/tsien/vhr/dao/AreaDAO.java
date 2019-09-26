package com.tsien.vhr.dao;

import com.tsien.vhr.model.Area;

import java.util.List;

public interface AreaDAO {
    int deleteByPrimaryKey(Long areaId);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Long areaId);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

    List<Area> listAreasByParentId(Long parentId);

    List<Area> listAreasByAreaId(Long areaId);
}