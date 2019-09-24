package com.tsien.vhr.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

@Data
public class Salary {
    /**
    * 薪资表ID
    */
    private Long salaryId;

    /**
    * 基本工资
    */
    private Integer salaryBasic;

    /**
    * 账套名称
    */
    private String name;

    /**
    * 奖金
    */
    private Integer bonus;

    /**
    * 交通补助
    */
    private Integer travelAllowance;

    /**
    * 午餐补助
    */
    private Integer lunchAllowance;

    /**
    * 应发工资
    */
    private Integer salaryPayable;

    /**
    * 养老金基数
    */
    private Integer pensionBase;

    /**
    * 养老金比率
    */
    private Double pensionPer;

    /**
    * 医疗基数
    */
    private Integer medicalBase;

    /**
    * 医疗保险比率
    */
    private Double medicalPer;

    /**
    * 公积金基数
    */
    private Integer accumulationFundBase;

    /**
    * 公积金比率
    */
    private Double accumulationFundPer;

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