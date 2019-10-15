package com.tsien.vhr.dao;

import com.tsien.vhr.model.ProfessionalTitle;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface ProfessionalTitleDAO {

    int deleteByPrimaryKey(Long professionalTitleId);

    int insert(ProfessionalTitle record);

    /**
     * 有选择的新增职称
     *
     * @param record record
     * @return 增加的行数
     */
    int insertSelective(ProfessionalTitle record);

    ProfessionalTitle selectByPrimaryKey(Long professionalTitleId);

    /**
     * 根据主键，选择性更新
     *
     * @param record record
     * @return 更新的行数
     */
    int updateByPrimaryKeySelective(ProfessionalTitle record);

    int updateByPrimaryKey(ProfessionalTitle record);

    /**
     * 查询所有的职称
     *
     * @return professionalTitles
     */
    List<ProfessionalTitle> listProfessionalTitles();

    /**
     * 根据职称名称查询职称
     *
     * @param professionalTitleName professionalTitleName
     * @return ProfessionalTitle
     */
    ProfessionalTitle getProfessionalTitleByProfessionalTitleName(String professionalTitleName);

    /**
     * 根据ID批量删除职称
     *
     * @param professionalTitlesIdArray professionalTitlesIdArray
     * @return 删除的行数
     */
    int deleteProfessionalTitlesByIds(String[] professionalTitlesIdArray);
}