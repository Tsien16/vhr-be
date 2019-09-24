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
public class EmployeeTraining {
    /**
    * 员工培训表ID
    */
    private Long trainingId;

    /**
    * 员工ID
    */
    private Long employeeId;

    /**
    * 培训日期
    */
    private LocalDate trainingDate;

    /**
    * 培训内容
    */
    private String trainingContent;

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