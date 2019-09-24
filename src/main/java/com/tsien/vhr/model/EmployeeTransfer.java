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
public class EmployeeTransfer {
    /**
    * 员工调岗表ID
    */
    private Long transferId;

    /**
    * 员工ID
    */
    private Long employeeId;

    /**
    * 调动前部门ID
    */
    private Long departmentIdBefore;

    /**
    * 调动后部门ID
    */
    private Long departmentIdAfter;

    /**
    * 调动前职位ID
    */
    private Long positionIdBefore;

    /**
    * 调动后职位ID
    */
    private Long positionIdAfter;

    /**
    * 调动日期
    */
    private LocalDate transferDate;

    /**
    * 调动原因
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