package com.tsien.vhr.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Resource {
    /**
    * 系统资源表主键
    */
    private Long resourceId;

    private String resourceUrl;

    private String resourcePath;

    private String component;

    private String name;

    private String iconCls;

    private Boolean keepAlive;

    private Boolean requireAuth;

    private Long parentId;

    private Boolean isEnabled;

    private Boolean isDeleted;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;
}