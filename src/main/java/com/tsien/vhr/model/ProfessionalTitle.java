package com.tsien.vhr.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ProfessionalTitle {
    /**
    * 职称ID
    */
    private Long professionalTitleId;

    /**
    * 职称名称
    */
    private String name;

    /**
    * 职称级别
    */
    private Object level;

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