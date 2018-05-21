package com.nisum.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayBeanNamesUsingBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" After--Initialization--> "+"the apprehended bean is " + bean + " and the bean name is " + beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" Before--Initialization--> "+"the apprehended bean is " + bean + " and the bean name is " + beanName);
		return bean;
	}

}
