package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.PoliticalStatusDAO;
import com.tsien.vhr.model.PoliticalStatus;
import com.tsien.vhr.service.PoliticalStatusService;
import com.tsien.vhr.util.ServerResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/4 0004 22:40
 */

@Service
public class PoliticalStatusServiceImpl implements PoliticalStatusService {

    @Resource
    private PoliticalStatusDAO politicalStatusDAO;

    @Override
    public ServerResponse<List<PoliticalStatus>> listPoliticalStatus() {
        return ServerResponse.ok(politicalStatusDAO.listPoliticalStatus());
    }
}
