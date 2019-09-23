package com.tsien.vhr.dao;

import com.tsien.vhr.model.PoliticalStatus;

public interface PoliticalStatusDAO {
    int deleteByPrimaryKey(Long politicalStatusId);

    int insert(PoliticalStatus record);

    int insertSelective(PoliticalStatus record);

    PoliticalStatus selectByPrimaryKey(Long politicalStatusId);

    int updateByPrimaryKeySelective(PoliticalStatus record);

    int updateByPrimaryKey(PoliticalStatus record);
}