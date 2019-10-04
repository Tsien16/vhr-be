package com.tsien.vhr.service;

import com.tsien.vhr.model.PoliticalStatus;
import com.tsien.vhr.util.ServerResponse;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/4 0004 22:40
 */

public interface PoliticalStatusService {

    /**
     * 查询所有政治面貌
     *
     * @return PoliticalStatus
     */
    ServerResponse<List<PoliticalStatus>> listPoliticalStatus();
}
