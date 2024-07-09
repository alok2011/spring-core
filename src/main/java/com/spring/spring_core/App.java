package com.spring.spring_core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.spring_core.model.Employee;

public class App 
{

	public static void main(String[] args) 
	{
	
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee bean = app.getBean("employee",Employee.class);
		System.out.println(bean);

		Employee bean1 = app.getBean(Employee.class);
		System.out.println(bean1);
		
	}

}
