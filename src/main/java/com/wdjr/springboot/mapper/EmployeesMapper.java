package com.wdjr.springboot.mapper;

import com.wdjr.springboot.bean.Employees;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;



import java.util.List;

@Mapper
public interface EmployeesMapper {

    @Select(value = "select * from employees")
    List<Employees> getAll();

    @Update(value = "update employees")
    void edit(Employees employees);

    @Delete(value = "delete from employees where id = #{id}")
    void  delEmp(int id);
}
