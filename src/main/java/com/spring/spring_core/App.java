package com.spring.spring_core;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.spring_core.Dao.EmployeeDao;
import com.spring.spring_core.model.Employee;

public class App 
{

	public static void main(String[] args) 
	{
	
		ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
		EmployeeDao edao = app.getBean("edao", EmployeeDao.class);
		Employee emp = new Employee(23, "Nakul", 80000);
//    	edao.saveEmployee(emp);
//    	System.out.println("save successfully");

		emp = new Employee(23, "Arjun", 70_000);
//    	edao.updateEmployee(emp);
//    	System.out.println("updated successfully");

//    	edao.deleteEmployee(emp);
		List<Employee> allEmp=edao.getAllEmp();
		
		for (Employee employee : allEmp) {
			System.out.println(employee);
		}
		System.out.println("updated successfully");
		
	}

}
