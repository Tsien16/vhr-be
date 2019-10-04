package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.ProfessionalTitleDAO;
import com.tsien.vhr.model.ProfessionalTitle;
import com.tsien.vhr.service.ProfessionalTitleService;
import com.tsien.vhr.util.ServerResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/4 0004 23:19
 */

@Service
public class ProfessionalTitleServiceImpl implements ProfessionalTitleService {

    @Resource
    private ProfessionalTitleDAO professionalTitleDAO;

    @Override
    public ServerResponse<List<ProfessionalTitle>> listProfessionalTitles() {
        return ServerResponse.ok(professionalTitleDAO.listProfessionalTitles());
    }
}
