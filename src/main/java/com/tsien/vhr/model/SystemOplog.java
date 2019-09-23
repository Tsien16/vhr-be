package com.tsien.vhr.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class SystemOplog {
    private Long oplogId;

    /**
    * 操作员ID
    */
    private Long userId;

    /**
    * 操作内容
    */
    private String operationContent;

    /**
    * 创建日期
    */
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;
}