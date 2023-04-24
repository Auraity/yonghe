/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.21-log : Database - ssm_yonghe
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm_yonghe` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm_yonghe`;

/*Table structure for table `tb_door` */

DROP TABLE IF EXISTS `tb_door`;

CREATE TABLE `tb_door` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `tel` varchar(100) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `tb_door` */

insert  into `tb_door`(`id`,`name`,`tel`,`addr`) values (1,'永和大王(黄石港店)','0714-6211231','黄石市黄石港区沿江路黄石港店'),(2,'永和大王(磁湖路店)','0714-82356537','湖北省黄石市下陆区磁湖路'),(3,'永和大王(团城山店)','0714-84477746','湖北省黄石市下陆区团城山店'),(4,'永和大王(西塞山店)','0714-65286602','湖北省黄石市西塞山区西塞山店'),(5,'永和大王(八栋口店)','0714-62152539','湖北省黄石市黄石港区沈家营八栋口店'),(6,'222','13811111111','黄石');

/*Table structure for table `tb_order` */

DROP TABLE IF EXISTS `tb_order`;

CREATE TABLE `tb_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `door_id` int(11) DEFAULT NULL,
  `order_no` varchar(50) DEFAULT NULL,
  `order_type` varchar(50) DEFAULT NULL,
  `pnum` int(11) DEFAULT NULL,
  `cashier` varchar(50) DEFAULT NULL,
  `order_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pay_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pay_type` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `door_id` (`door_id`),
  CONSTRAINT `tb_order_ibfk_1` FOREIGN KEY (`door_id`) REFERENCES `tb_door` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `tb_order` */

insert  into `tb_order`(`id`,`door_id`,`order_no`,`order_type`,`pnum`,`cashier`,`order_time`,`pay_time`,`pay_type`,`price`) values (1,1,'P001','堂食',1,'张三','2023-04-18 14:36:49','2023-04-18 14:36:49','微信支付',16),(2,1,'P003','外卖',3,'张三','2023-04-18 14:36:49','2023-04-18 14:36:49','微信支付',20),(3,1,'P005','打包',1,'张三','2023-04-18 14:36:49','2023-04-18 14:36:49','微信支付',28),(4,1,'P007','堂食',1,'李四','2023-04-18 14:36:49','2023-04-18 14:36:49','微信支付',49),(6,1,'hbnu001','堂食',2,'陈迪凯','2023-04-18 14:36:49','2023-04-18 14:36:49','微信支付',50),(9,1,'1122','堂食',33,'11','2023-04-20 16:05:19','2023-04-20 16:05:19','微信支付',667),(10,1,'5555','堂食',33,'11','2023-04-22 17:03:30','2023-04-22 17:03:30','微信支付',888),(11,1,'5555','堂食',33,'11','2023-04-22 17:07:04','2023-04-22 17:07:04','微信支付',888);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
