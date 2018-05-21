package com.nisum.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String[] args) {
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
		
		
		/*Triangle triangle=factory.getBean("triangle",Triangle.class);
		triangle.draw();*/
		
		Shape s= factory.getBean("circle",Shape.class);
		s.draw();
		
		((ConfigurableApplicationContext)factory).close();
		
	}

}
