package com.joker.staffmanagement.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joker.staffmanagement.domain.Employees;
import com.joker.staffmanagement.mapper.EmployeesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    private EmployeesMapper employeesMapper;

    //查询所有员工
    public Page<Employees> findPage(int page,int size){
        Page employeesPage = employeesMapper.selectPage(new Page(page, size), null);
        return employeesPage;
    }

    //添加员工
    public void add(Employees employees){
        employeesMapper.insert(employees);
    }

}
