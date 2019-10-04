package com.tsien.vhr.service.impl;

import com.tsien.vhr.dao.NationDAO;
import com.tsien.vhr.model.Nation;
import com.tsien.vhr.service.NationService;
import com.tsien.vhr.util.ServerResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/4 0004 22:26
 */

@Service
public class NationServiceImpl implements NationService {

    @Resource
    private NationDAO nationDAO;

    @Override
    public ServerResponse<List<Nation>> listNations() {
        return ServerResponse.ok(nationDAO.listNations());
    }
}
