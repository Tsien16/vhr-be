package com.tsien.vhr.dao;

import com.tsien.vhr.model.ProfessionalTitle;

public interface ProfessionalTitleDAO {
    int deleteByPrimaryKey(Long professionalTitleId);

    int insert(ProfessionalTitle record);

    int insertSelective(ProfessionalTitle record);

    ProfessionalTitle selectByPrimaryKey(Long professionalTitleId);

    int updateByPrimaryKeySelective(ProfessionalTitle record);

    int updateByPrimaryKey(ProfessionalTitle record);
}