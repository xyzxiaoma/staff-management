package com.joker.staffmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    //首页跳转
    @RequestMapping("")
    public String index(){
        return "/admin/index";
    }

}
