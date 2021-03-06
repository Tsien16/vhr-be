package com.tsien.vhr.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
public class Employee {

    /**
     * 员工ID
     */
    private Long employeeId;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 婚姻状况
     */
    private Object maritalStatus;

    /**
     * 民族
     */
    private Long nationId;

    /**
     * 民族名称
     */
    private String nationName;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 政治面貌ID
     */
    private Long politicalStatusId;

    /**
     * 政治面貌名称
     */
    private String politicalStatusName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 所属部门ID
     */
    private Long departmentId;

    /**
     * 所在部门名称
     */
    private String departmentName;

    /**
     * 职称ID
     */
    private Long professionalTitleId;

    /**
     * 职称名称
     */
    private String professionalTitleName;

    /**
     * 职位ID
     */
    private Long positionId;

    /**
     * 职位名称
     */
    private String positionName;

    /**
     * 聘用形式
     */
    private String employmentForm;

    /**
     * 最高学历
     */
    private Object highestDegree;

    /**
     * 毕业院校
     */
    private String school;

    /**
     * 所属专业
     */
    private String specialty;

    /**
     * 入职日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate positionStartDate;

    /**
     * 在职状态
     */
    private Object workingStatus;

    /**
     * 工号
     */
    private String workNumber;

    /**
     * 合同期限
     */
    private Double contractPeriod;

    /**
     * 转正日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate conversionDate;

    /**
     * 离职日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dimissionDate;

    /**
     * 合同起始日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate contractBegin;

    /**
     * 合同终止日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate contractEnd;

    /**
     * 工龄
     */
    private Integer workAge;

    /**
     * 是否逻辑删除，1-表示删除，0-表示未删除
     */
    private Boolean deleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 薪水
     */
    private Salary salary;
}