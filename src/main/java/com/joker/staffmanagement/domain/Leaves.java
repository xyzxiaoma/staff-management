package com.joker.staffmanagement.domain;

import lombok.Data;

//请假表
@Data
public class Leaves {
    private Integer lid; //请假id
    private Integer eid; //员工id
    private Data leaveDate; //请假时间
    private String leaveType; //请假类型
    private String leaveReason; //请假原因



}
