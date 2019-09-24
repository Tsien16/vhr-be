package com.tsien.vhr.dao;

import com.tsien.vhr.model.PoliticalStatus;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface PoliticalStatusDAO {
    int deleteByPrimaryKey(Long politicalStatusId);

    int insert(PoliticalStatus record);

    int insertSelective(PoliticalStatus record);

    PoliticalStatus selectByPrimaryKey(Long politicalStatusId);

    int updateByPrimaryKeySelective(PoliticalStatus record);

    int updateByPrimaryKey(PoliticalStatus record);
}