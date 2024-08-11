package com.spring.spring_core;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.spring_core.Dao.EmployeeDao;
import com.spring.spring_core.config.SpringConfig;
import com.spring.spring_core.model.Employee;

public class App 
{

	public static void main(String[] args) 
	{
		
//=================This Is Spring JDBC Java Based==========================		
	
		ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);

		EmployeeDao edao1 = app.getBean(EmployeeDao.class);
		
		Employee emp = new Employee(111, "Shankey Tiwari", 98000);
    	edao1.saveEmployee(emp);
    	System.out.println("Data Saved Successfully");

//		Employee emp = new Employee(5, "Anurag Gupta", 30000);
//    	edao1.updateEmployee(emp);
//    	System.out.println("updated successfully");

//    	edao1.deleteEmployee(emp);
//    	System.out.println("Deleted Successfully");
//    	System.out.println();
		List<Employee> allEmp = edao1.getAllEmp();
		
		for (Employee employee : allEmp) {
			System.out.println(employee);
		}
		System.out.println("Data Fetched successfully");
		
	}

}
