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
		Employee e1 = (Employee)ioc.getBean("emp");
		System.out.println(e1);
	}

}
