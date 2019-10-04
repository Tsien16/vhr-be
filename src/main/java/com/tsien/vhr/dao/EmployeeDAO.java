package com.tsien.vhr.dao;

import com.tsien.vhr.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

public interface EmployeeDAO {

    int deleteByPrimaryKey(Long employeeId);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Long employeeId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    /**
     * 根据各种关键词查询员工
     *
     * @param keywords               名称模糊匹配
     * @param politicalStatusId      政治面貌ID
     * @param nationId               民族ID
     * @param positionId             职位ID
     * @param professionalTitleId    职称ID
     * @param employmentForm         招聘来源
     * @param departmentId           部门ID
     * @param positionStartDateBegin 入职时间
     * @param positionStartDateEnd   入职时间
     * @return employeeList
     */
    List<Employee> listEmployeesByKeywords(@Param("keywords") String keywords,
                                           @Param("politicalStatusId") Long politicalStatusId,
                                           @Param("nationId") Long nationId,
                                           @Param("positionId") Long positionId,
                                           @Param("professionalTitleId") Long professionalTitleId,
                                           @Param("employmentForm") String employmentForm,
                                           @Param("departmentId") Long departmentId,
                                           @Param("positionStartDateBegin") LocalDate positionStartDateBegin,
                                           @Param("positionStartDateEnd") LocalDate positionStartDateEnd);

    /**
     * 查询当前的最大工号
     *
     * @return workNumber
     */
    Long getMaxWorkNumber();
}