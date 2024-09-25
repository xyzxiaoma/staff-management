package com.joker.staffmanagement.domain;

import lombok.Data;

//部门类
@Data
public class Departments {
    private Integer did; //部门id
    private String departmentName; //部门名称
    private Integer mid; // 经理id
}
