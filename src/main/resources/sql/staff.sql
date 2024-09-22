/*
 Navicat Premium Dump SQL

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80039 (8.0.39)
 Source Host           : localhost:3306
 Source Schema         : staff

 Target Server Type    : MySQL
 Target Server Version : 80039 (8.0.39)
 File Encoding         : 65001

 Date: 22/09/2024 22:39:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for departments
-- ----------------------------
DROP TABLE IF EXISTS `departments`;
CREATE TABLE `departments`  (
  `did` int NOT NULL,
  `DepartmentName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `mid` int NULL DEFAULT NULL,
  PRIMARY KEY (`did`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of departments
-- ----------------------------
INSERT INTO `departments` VALUES (1, '人力资源部', 101);
INSERT INTO `departments` VALUES (2, '技术部', 102);
INSERT INTO `departments` VALUES (3, '财务部', 103);
INSERT INTO `departments` VALUES (4, '市场部', 104);

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees`  (
  `eid` int NOT NULL,
  `FirstName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `LastName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `BirthDate` date NULL DEFAULT NULL,
  `HireDate` date NULL DEFAULT NULL,
  `did` int NULL DEFAULT NULL,
  `Position` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `Salary` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`eid`) USING BTREE,
  INDEX `did`(`did` ASC) USING BTREE,
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`did`) REFERENCES `departments` (`did`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES (1, '李', '雷', '1985-01-15', '2010-06-01', 1, '经理', 8000.00);
INSERT INTO `employees` VALUES (2, '韩', '梅梅', '1990-03-22', '2012-09-15', 2, '开发工程师', 6000.00);
INSERT INTO `employees` VALUES (3, '张', '伟', '1988-07-30', '2011-11-20', 3, '会计', 5000.00);
INSERT INTO `employees` VALUES (4, '王', '芳', '1992-12-05', '2015-01-10', 4, '市场专员', 4500.00);
INSERT INTO `employees` VALUES (5, '赵', '强', '1987-05-18', '2013-03-25', 2, '测试工程师', 5500.00);
INSERT INTO `employees` VALUES (6, '刘', '洋', '1991-08-14', '2014-07-30', 1, '人事专员', 4800.00);
INSERT INTO `employees` VALUES (7, '陈', '静', '1989-11-11', '2016-02-20', 3, '财务主管', 7000.00);
INSERT INTO `employees` VALUES (8, '杨', '敏', '1993-04-25', '2017-05-15', 4, '市场经理', 7500.00);

-- ----------------------------
-- Table structure for leaves
-- ----------------------------
DROP TABLE IF EXISTS `leaves`;
CREATE TABLE `leaves`  (
  `lid` int NOT NULL,
  `eid` int NULL DEFAULT NULL,
  `LeaveDate` date NULL DEFAULT NULL,
  `LeaveType` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `LeaveReason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`lid`) USING BTREE,
  INDEX `eid`(`eid` ASC) USING BTREE,
  CONSTRAINT `leaves_ibfk_1` FOREIGN KEY (`eid`) REFERENCES `employees` (`eid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of leaves
-- ----------------------------
INSERT INTO `leaves` VALUES (1, 1, '2023-01-10', '年假', '家庭旅行');
INSERT INTO `leaves` VALUES (2, 2, '2023-02-15', '病假', '感冒');
INSERT INTO `leaves` VALUES (3, 3, '2023-03-20', '事假', '处理个人事务');
INSERT INTO `leaves` VALUES (4, 4, '2023-04-25', '年假', '休息');
INSERT INTO `leaves` VALUES (5, 5, '2023-05-30', '病假', '牙痛');
INSERT INTO `leaves` VALUES (6, 6, '2023-06-15', '事假', '搬家');
INSERT INTO `leaves` VALUES (7, 7, '2023-07-20', '年假', '旅游');
INSERT INTO `leaves` VALUES (8, 8, '2023-08-25', '病假', '发烧');

SET FOREIGN_KEY_CHECKS = 1;
