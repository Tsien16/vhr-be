package com.tsien.vhr.service;

import com.tsien.vhr.model.Nation;
import com.tsien.vhr.util.ServerResponse;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/4 0004 22:26
 */

public interface NationService {

    /**
     * 查询所有的民族
     *
     * @return nations
     */
    ServerResponse<List<Nation>> listNations();
}
