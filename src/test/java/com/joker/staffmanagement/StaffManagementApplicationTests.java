package com.joker.staffmanagement;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joker.staffmanagement.domain.Employees;
import com.joker.staffmanagement.mapper.EmployeesMapper;
import com.joker.staffmanagement.service.EmployeesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StaffManagementApplicationTests {
    @Autowired
    private EmployeesService employeesService;

    @Test
    void contextLoads() {
        Page<Employees> employeesPage = employeesService.findPage(1, 10);
        for(Employees employees: employeesPage.getRecords()){
            System.out.println(employees);
        }
    }

}
