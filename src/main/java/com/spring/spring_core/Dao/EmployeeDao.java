package com.spring.spring_core.Dao;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.spring_core.model.Employee;
import com.spring.spring_core.model.EmployeeMapper;
//import com.spring.spring_core.model.EmployeeMapper;

public class EmployeeDao
{
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> getAllEmp()
	{
		
		
		return jdbcTemplate.query("select * from employee", new EmployeeMapper()) ;

	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee (id,name,salary) values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id='" + e.getId() + "' ";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}

}