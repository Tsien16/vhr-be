package com.tsien.vhr.dao;

import com.tsien.vhr.model.Nation;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface NationDAO {

    int deleteByPrimaryKey(Long nationId);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Long nationId);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);

    /**
     * 查询所有的民族
     *
     * @return nations
     */
    List<Nation> listNations();
}