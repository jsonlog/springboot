package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test26SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test26SecurityApplication.class, args);
	}
	/*
	 * create database sang;
insert  into `sys_role`(`id`,`name`) values (1,'ROLE_ADMIN'),(2,'ROLE_USER');

insert  into `sys_user`(`id`,`password`,`username`) values (1,'root','root'),(2,'sang','sang');

insert  into `sys_user_roles`(`sys_user_id`,`roles_id`) values (1,1),(2,2);

	 */
}
