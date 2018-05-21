package com.nisum.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingAppCodingToInterfaces {
	
	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring2.xml");
		
		
		Shape s= factory.getBean("shape",Shape.class);
		s.draw();
		
		((ConfigurableApplicationContext)factory).close();
		
	}

}
