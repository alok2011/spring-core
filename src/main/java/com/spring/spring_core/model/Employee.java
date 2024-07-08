package com.spring.spring_core.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	private String name = "Ayush";
	private String gender = "Male";
	
	private Address address;
	
	

	public Employee(String name, String gender, Address address)
	{
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
	}

	public Employee() 
	{
		super();
		System.out.println("Employee.Employee()");
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		System.out.println("Employee.setName()");
		this.name = name;
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public Address getAddress() 
	{
		return address;
	}

	@Autowired
	public void setAddress(Address address) 
	{
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

	

	
	
	
	
	
	
}
