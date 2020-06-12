/*
Navicat MySQL Data Transfer

Source Server         : LOKAL
Source Server Version : 100135
Source Host           : localhost:3307
Source Database       : mahasiswa

Target Server Type    : MYSQL
Target Server Version : 100135
File Encoding         : 65002

Date: 2020-06-12 22:02:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for mahasiswa
-- ----------------------------
DROP TABLE IF EXISTS `mahasiswa`;
CREATE TABLE `mahasiswa` (
  `nim` varchar(30) NOT NULL,
  `nama` varchar(10) NOT NULL,
  `jurusan` varchar(30) NOT NULL,
  PRIMARY KEY (`nim`)
`Kelas' Varchar(10) NOT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mahasiswa
-- ----------------------------
INSERT INTO `mahasiswa` VALUES ('13020180028', 'FITRIANI HASBULLAH', 'TEKNIK KOMPUTER', 'B1');