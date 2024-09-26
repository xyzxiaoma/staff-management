package com.joker.staffmanagement.domain;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//员工类
@Data
public class Employees {
    private Integer eid; //员工id
    private String firstName; //员工姓
    private String lastName; //员工名
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate; //员工生日
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hireDate; //入职日期
    private Integer did; //部门id
    private String position; //员工职位
    private double salary; //员工薪水
}
