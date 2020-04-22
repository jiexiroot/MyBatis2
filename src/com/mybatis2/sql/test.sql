/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL_Spring
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 22/04/2020 17:19:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_idcard
-- ----------------------------
DROP TABLE IF EXISTS `tb_idcard`;
CREATE TABLE `tb_idcard`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_idcard
-- ----------------------------
INSERT INTO `tb_idcard` VALUES (1, '11111');
INSERT INTO `tb_idcard` VALUES (2, '22222');

-- ----------------------------
-- Table structure for tb_orders
-- ----------------------------
DROP TABLE IF EXISTS `tb_orders`;
CREATE TABLE `tb_orders`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `number` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_id` int(32) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  CONSTRAINT `tb_orders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_orders
-- ----------------------------
INSERT INTO `tb_orders` VALUES (1, '1000011', 1);
INSERT INTO `tb_orders` VALUES (2, '1000012', 1);
INSERT INTO `tb_orders` VALUES (3, '1000013', 2);

-- ----------------------------
-- Table structure for tb_ordersitem
-- ----------------------------
DROP TABLE IF EXISTS `tb_ordersitem`;
CREATE TABLE `tb_ordersitem`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `orders_id` int(32) NULL DEFAULT NULL,
  `product_id` int(32) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `orders_id`(`orders_id`) USING BTREE,
  INDEX `product_id`(`product_id`) USING BTREE,
  CONSTRAINT `tb_ordersitem_ibfk_1` FOREIGN KEY (`orders_id`) REFERENCES `tb_orders` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_ordersitem_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `tb_product` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_ordersitem
-- ----------------------------
INSERT INTO `tb_ordersitem` VALUES (1, 1, 1);
INSERT INTO `tb_ordersitem` VALUES (2, 1, 3);
INSERT INTO `tb_ordersitem` VALUES (3, 3, 3);

-- ----------------------------
-- Table structure for tb_person
-- ----------------------------
DROP TABLE IF EXISTS `tb_person`;
CREATE TABLE `tb_person`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `sex` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cardId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `card_id_idx`(`cardId`) USING BTREE,
  CONSTRAINT `card_id` FOREIGN KEY (`cardId`) REFERENCES `tb_idcard` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_person
-- ----------------------------
INSERT INTO `tb_person` VALUES (1, 'rose', 29, '女', 2);
INSERT INTO `tb_person` VALUES (2, 'Tom', 21, '男', 1);

-- ----------------------------
-- Table structure for tb_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(35) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_product
-- ----------------------------
INSERT INTO `tb_product` VALUES (1, 'Java基础入门', 44.5);
INSERT INTO `tb_product` VALUES (2, 'Java Web程序开发入门', 38.5);
INSERT INTO `tb_product` VALUES (3, 'SSM框架整合实战', 50);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, '詹姆斯', '克利夫兰');
INSERT INTO `tb_user` VALUES (2, '科比', '洛杉矶');
INSERT INTO `tb_user` VALUES (3, '保罗', '洛杉矶');

SET FOREIGN_KEY_CHECKS = 1;
