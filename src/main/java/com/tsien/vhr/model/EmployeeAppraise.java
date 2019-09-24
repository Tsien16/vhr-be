package com.tsien.vhr.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

@Data
public class EmployeeAppraise {
    /**
    * 员工考评表
    */
    private Long appraiseId;

    /**
    * 员工ID
    */
    private Long employeeId;

    /**
    * 考评日期
    */
    private LocalDate appraiseDate;

    /**
    * 考评结果
    */
    private String appraiseResult;

    /**
    * 考评内容
    */
    private String appraiseContent;

    /**
    * 备注
    */
    private String remark;

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