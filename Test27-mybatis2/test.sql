create database mybatis;
use mybatis;
CREATE TABLE `user` (  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,  `username` varchar(32) NOT NULL,  `address` varchar(64) NOT NULL,  `password` varchar(64) NOT NULL,  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8
INSERT INTO user(username,password,address) values("张三","111","西安");
INSERT INTO user(username,password,address) values("lisi","222","长沙");
INSERT INTO user(username,password,address) values("昂无","333","厦门");
INSERT INTO user(username,password,address) values("赵柳","444","北京");
select * from user