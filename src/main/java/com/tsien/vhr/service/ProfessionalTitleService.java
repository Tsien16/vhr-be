package com.tsien.vhr.service;

import com.tsien.vhr.model.ProfessionalTitle;
import com.tsien.vhr.util.ServerResponse;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/4 0004 23:19
 */

public interface ProfessionalTitleService {

    /**
     * 查询所有的职称
     *
     * @return professionalTitles
     */
    ServerResponse<List<ProfessionalTitle>> listProfessionalTitles();


    /**
     * 插入职称
     *
     * @param professionalTitleName  professionalTitleName
     * @param professionalTitleLevel professionalTitleLevel
     * @return 插入的结果
     */
    ServerResponse addProfessionalTitle(String professionalTitleName, String professionalTitleLevel);

    /**
     * 根据ID删除职称
     *
     * @param ids ids
     * @return 删除的结果
     */
    ServerResponse deleteProfessionalTitlesByIds(String ids);

    /**
     * 根据主键更新职称
     *
     * @param professionalTitleId    professionalTitleId
     * @param professionalTitleName  professionalTitleName
     * @param professionalTitleLevel professionalTitleLevel
     * @return 更新的结果
     */
    ServerResponse updateProfessionalTitleById(Long professionalTitleId, String professionalTitleName,
                                               String professionalTitleLevel);
}
