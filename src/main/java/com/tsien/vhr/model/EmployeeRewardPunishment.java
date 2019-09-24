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
public class EmployeeRewardPunishment {
    /**
    * 员工奖惩表ID
    */
    private Long rpId;

    /**
    * 员工ID
    */
    private Long employeeId;

    /**
    * 奖罚日期
    */
    private LocalDate rpDate;

    /**
    * 奖罚原因
    */
    private String rpReason;

    /**
    * 奖罚分
    */
    private Integer rpPoint;

    /**
    * 奖罚类别，0：奖，1：罚
    */
    private Boolean rpType;

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