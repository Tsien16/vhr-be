package com.tsien.vhr.vo;

import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/10/17 0017 13:31
 */

@Data
public class ResourceVO {

    /**
     * 系统资源表主键
     */
    private Long resourceId;

    /**
     * 组件名
     */
    private String name;

    /**
     * 上级资源ID
     */
    private Long parentId;

    /**
     * 下级资源
     */
    private List<ResourceVO> children;
}
