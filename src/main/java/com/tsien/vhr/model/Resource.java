package com.tsien.vhr.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/9 0009 12:35
 */

@Data
public class Resource {

    /**
     * 系统资源表主键
     */
    private Long resourceId;

    /**
     * 资源URL，用于Spring Security权限拦截
     */
    private String resourceUrl;

    /**
     * 资源路径，供前端使用
     */
    private String resourcePath;

    /**
     * 组件名称，供前端使用
     */
    private String component;

    /**
     * 组件名
     */
    private String name;

    /**
     * 资源图标，供前端使用
     */
    private String iconCls;

    /**
     * 资源切换时，是否保活，供前端使用
     */
    private Boolean keepAlive;

    /**
     * 是否登录后才能访问，供前端使用
     */
    private Boolean requireAuth;

    /**
     * 上级资源ID
     */
    private Long parentId;

    /**
     * 生否生效，1-生效，0-失效
     */
    private Boolean enabled;

    /**
     * 是否逻辑删除，1-逻辑已删除，0-逻辑未删除
     */
    private Boolean deleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 资源需要的权限
     */
    private List<Role> roles;

    /**
     * 下级资源
     */
    private List<Resource> subordinateResources;
}