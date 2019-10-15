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

    /**
     * 选择性的插入数据
     *
     * @param record record
     * @return 插入的行数
     */
    int insertSelective(Position record);

    Position selectByPrimaryKey(Long positionId);

    /**
     * 根据主键有选择的更新
     *
     * @param record record
     * @return 更新的行数
     */
    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    /**
     * 查询所有职位
     *
     * @return positions
     */
    List<Position> listPositions();

    /**
     * 根据名称查询职位
     *
     * @param positionName positionName
     * @return position
     */
    Position getPositionByPositionName(String positionName);

    /**
     * 根据ids删除职位
     *
     * @param positionIdArray positionIdArray
     * @return 删除的行数
     */
    int deletePositionsByIds(String[] positionIdArray);
}