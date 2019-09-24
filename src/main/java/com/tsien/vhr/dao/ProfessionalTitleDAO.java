package com.tsien.vhr.dao;

import com.tsien.vhr.model.ProfessionalTitle;

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

    int insertSelective(ProfessionalTitle record);

    ProfessionalTitle selectByPrimaryKey(Long professionalTitleId);

    int updateByPrimaryKeySelective(ProfessionalTitle record);

    int updateByPrimaryKey(ProfessionalTitle record);
}