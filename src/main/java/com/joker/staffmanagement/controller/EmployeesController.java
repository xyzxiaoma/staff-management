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

    @RequestMapping("/add_page")
    public String addPage(){
        return "/admin/add_employees";
    }

    @RequestMapping("/add")
    public String add(Employees employees){
        employeesService.add(employees);
        return "redirect:/employees/all";
    }

    @RequestMapping("/edit")
    public ModelAndView edit(Integer eid){
        ModelAndView modelAndView = new ModelAndView();
        Employees employees = employeesService.findById(eid);
        modelAndView.addObject("employees",employees);
        modelAndView.setViewName("/admin/edit_employees");
        return modelAndView;
    }

    @RequestMapping("/edit_employees")
    public String edit_employees(Employees employees){
        employeesService.updateById(employees);
        return "redirect:/employees/all";
    }

    @RequestMapping("/delete")
    public String delete(Integer eid){
        employeesService.deleteById(eid);
        return "redirect:/employees/all";
    }



}
