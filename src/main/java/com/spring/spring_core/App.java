package com.spring.spring_core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.spring_core.model.DatabaseSingleton;
//import com.spring.spring_core.model.Employee;

public class App 
{

	public static void main(String[] args) 
	{
	
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		DatabaseSingleton obj = ioc.getBean(DatabaseSingleton.class,"dbSingleton");
		System.out.println(obj);
	
		ApplicationContext ioc2 = new ClassPathXmlApplicationContext("applicationContext.xml");
		DatabaseSingleton obj1 = (DatabaseSingleton) ioc2.getBean("dbSingleton");
		System.out.println(obj1);
		
	}

}
