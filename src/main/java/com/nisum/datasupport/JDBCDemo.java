package com.nisum.datasupport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCDemo {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springJDBC.xml");
		CircleDAOimpl daOimpl=context.getBean("circleDAOimpl",CircleDAOimpl.class);
		
		Circle circle=daOimpl.getCircle(1);
		System.out.println(circle);
		
	}

}
