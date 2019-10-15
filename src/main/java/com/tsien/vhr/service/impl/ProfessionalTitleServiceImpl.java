package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.ProfessionalTitleDAO;
import com.tsien.vhr.model.ProfessionalTitle;
import com.tsien.vhr.service.ProfessionalTitleService;
import com.tsien.vhr.util.ServerResponse;
import org.apache.commons.lang3.StringUtils;
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

    @Override
    public ServerResponse addProfessionalTitle(String professionalTitleName, String professionalTitleLevel) {

        if (StringUtils.isBlank(professionalTitleName) || StringUtils.isBlank(professionalTitleLevel)) {
            return ServerResponse.error("职称名称和职位级别不能为空");
        }

        ProfessionalTitle professionalTitle =
                professionalTitleDAO.getProfessionalTitleByProfessionalTitleName(professionalTitleName);

        if (professionalTitle != null) {
            return ServerResponse.error("职称名称已存在，不能重复添加");
        }

        professionalTitle = new ProfessionalTitle();
        professionalTitle.setName(professionalTitleName);
        professionalTitle.setLevel(professionalTitleLevel);
        professionalTitle.setDeleted(false);

        int resultCount = professionalTitleDAO.insertSelective(professionalTitle);
        if (resultCount > 0) {
            return ServerResponse.ok("添加职称成功");
        }
        return ServerResponse.error("添加职称失败");

    }

    @Override
    public ServerResponse deleteProfessionalTitlesByIds(String ids) {

        String[] professionalTitlesIdArray = ids.split(",");
        int resultCount = professionalTitleDAO.deleteProfessionalTitlesByIds(professionalTitlesIdArray);

        if (resultCount == professionalTitlesIdArray.length) {
            return ServerResponse.ok("职称删除成功");
        }

        if (resultCount > 0) {
            return ServerResponse.ok("批量删除了部分职称，部分为删除成功");
        }

        return ServerResponse.error("删除职称失败");

    }

    @Override
    public ServerResponse updateProfessionalTitleById(Long professionalTitleId, String professionalTitleName,
                                                      String professionalTitleLevel) {
        if (professionalTitleId == null || StringUtils.isBlank(professionalTitleName) || StringUtils.isBlank(professionalTitleLevel)) {
            return ServerResponse.error("职称名称、级别、ID不能为空");
        }

        ProfessionalTitle professionalTitle =
                professionalTitleDAO.getProfessionalTitleByProfessionalTitleName(professionalTitleName);

        if (professionalTitle != null) {
            return ServerResponse.error("职称名称已存在，无法修改");
        }

        professionalTitle = new ProfessionalTitle();
        professionalTitle.setProfessionalTitleId(professionalTitleId);
        professionalTitle.setName(professionalTitleName);
        professionalTitle.setLevel(professionalTitleLevel);

        int resultCount = professionalTitleDAO.updateByPrimaryKeySelective(professionalTitle);

        if (resultCount > 0) {
            return ServerResponse.ok("职称更新成功");
        }

        return ServerResponse.error("职称更新失败");
    }
}
