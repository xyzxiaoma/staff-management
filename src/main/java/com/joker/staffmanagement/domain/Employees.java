package com.joker.staffmanagement.domain;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//员工类
@Data
public class Employees {
    @TableId
    private Integer eid; //员工id
    private String firstName; //员工姓
    private String lastName; //员工名

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String birthDate; //员工生日

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String hireDate; //入职日期

    private Integer did; //部门id
    private String position; //员工职位
    private double salary; //员工薪水

}
