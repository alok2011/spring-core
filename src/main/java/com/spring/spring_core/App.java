package com.spring.spring_core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.spring_core.model.Employee;

public class App 
{

	public static void main(String[] args) 
	{
	
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee bean = ioc.getBean("employee", Employee.class);
		System.out.println(bean);
	
		Employee bean1 = ioc.getBean(Employee.class);
		System.out.println(bean1);
		
	}

}
