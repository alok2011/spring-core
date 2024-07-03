package com.spring.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.spring_core.model.Address;
import com.spring.spring_core.model.Employee;

public class App 
{

	public static void main(String[] args) 
	{
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee add = ioc.getBean(Employee.class, "emp2");
		System.out.println(add);
		
// It throws an exception because in applicationContext 2 beans are defined but we can add primary bean it means which bean will be inject if 2 beans are there in applicationContext
		
		
	}

}
