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
	
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao edao = app.getBean("edao", EmployeeDao.class);
		Employee emp = new Employee(4, "Khushi", 80000);
    	edao.saveEmployee(emp);
    	System.out.println("save successfully");

//		emp = new Employee(4, "Shanti", 70000);
//    	edao.updateEmployee(emp);
//    	System.out.println("updated successfully");

//    	edao.deleteEmployee(emp);
//    	System.out.println("Deleted Successfully");
//    	System.out.println();
//		List<Employee> allEmp = edao.getAllEmp();
//		
//		for (Employee employee : allEmp) {
//			System.out.println(employee);
//		}
//		System.out.println("Data Fetched successfully");
		
	}

}
