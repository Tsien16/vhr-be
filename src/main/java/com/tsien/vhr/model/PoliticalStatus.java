package com.tsien.vhr.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class PoliticalStatus {
    /**
    * 政治面貌表ID
    */
    private Long politicalStatusId;

    /**
    * 政治面貌名称
    */
    private String politicalStatusName;

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