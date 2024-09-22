# 基于sprongboot的员工管理系统
# 技术选型
- JDk17
- SpringBoot3
- SpringSecurity
- MyBatisplus
- MySQL
- Thymeleaf
- adminLTE
- lombok

# 功能模块
- 员工管理
- 部门管理
- 项目管理
- 统计分析

# 数据库设计

## 表：员工 (Employees)
| 字段名       | 数据类型     | 说明           |
| ------------ | ------------ | -------------- |
| eId          | INT          | 员工编号 (主键)|
| FirstName    | VARCHAR(50)  | 名字           |
| LastName     | VARCHAR(50)  | 姓氏           |
| BirthDate    | DATE         | 出生日期       |
| HireDate     | DATE         | 入职日期       |
| dId          | INT          | 部门编号 (外键)|
| Position     | VARCHAR(50)  | 职位           |
| Salary       | DECIMAL(10,2)| 薪水           |

## 表：部门 (Departments)
| 字段名       | 数据类型     | 说明           |
| ------------ | ------------ | -------------- |
| DepartmentID | INT          | 部门编号 (主键)|
| DepartmentName | VARCHAR(100)| 部门名称       |
| ManagerID    | INT          | 经理编号 (外键)|

## 表：请假 (Leaves)
| 字段名       | 数据类型     | 说明           |
| ------------ | ------------ | -------------- |
| LeaveID      | INT          | 请假编号 (主键)|
| eId          | INT          | 员工编号 (外键)|
| LeaveDate    | DATE         | 请假日期       |
| LeaveType    | VARCHAR(50)  | 请假类型       |
| LeaveReason  | VARCHAR(255) | 请假原因       |


