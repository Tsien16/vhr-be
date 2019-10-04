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
}
