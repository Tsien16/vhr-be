package com.tsien.vhr.dao;

import com.tsien.vhr.model.Nation;

public interface NationDAO {
    int deleteByPrimaryKey(Long nationId);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Long nationId);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);
}