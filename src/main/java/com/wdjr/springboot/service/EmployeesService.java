package com.wdjr.springboot.service;

import com.wdjr.springboot.bean.Employees;
import com.wdjr.springboot.mapper.EmployeesMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class EmployeesService {
    private static final Logger log = LoggerFactory.getLogger(EmployeesService.class);
    @Autowired
    private EmployeesMapper employeesMapper;

    public List<Employees> getAll(){
        List<Employees> all = employeesMapper.getAll();
        return all;
    }

    /**
     * 删除emp
     * @param id
     */
    public void delEmp(int id) {
        employeesMapper.delEmp(id);
    }

    public void editEmp(Employees employees) {



    }

}
