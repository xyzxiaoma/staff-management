package com.joker.staffmanagement.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joker.staffmanagement.domain.Employees;
import com.joker.staffmanagement.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    //查询所有员工
    @RequestMapping("/all")
    public ModelAndView findPage(@RequestParam(defaultValue = "1") Integer page,
                                 @RequestParam(defaultValue = "10") Integer size){
        Page<Employees> employeesPage = employeesService.findPage(page, size);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("employeesPage",employeesPage);
        modelAndView.setViewName("/admin/all_employees");
        return modelAndView;
    }

}
