package com.tsien.vhr.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class SalaryAdjustment {
    /**
    * 员工调薪表ID
    */
    private Long adjustmentId;

    /**
    * 员工ID
    */
    private Long employeeId;

    /**
    * 调薪日期
    */
    private LocalDate adjustmentDate;

    /**
    * 调前薪资ID
    */
    private Long salaryIdBefore;

    /**
    * 调后薪资ID
    */
    private Long salaryIdAfter;

    /**
    * 调薪原因
    */
    private String reason;

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