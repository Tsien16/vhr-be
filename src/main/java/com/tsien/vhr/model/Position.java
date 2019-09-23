package com.tsien.vhr.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Position {
    /**
    * 职位表ID
    */
    private Long positionId;

    /**
    * 职位名称
    */
    private String positionName;

    /**
    * 是否逻辑删除，1-表示删除，0-表示未删除
    */
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