package com.ei.dao;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

import com.ei.Bean.User;

public class testApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO dao = (UserDAO)ctx.getBean("UserDAO");
		User yama = (User)dao.findByName("username").get(0);
		System.out.println("nothing");
	}
}
