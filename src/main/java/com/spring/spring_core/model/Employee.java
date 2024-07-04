//package com.spring.spring_core.model;
//
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class Employee implements InitializingBean, DisposableBean
//{
//	private String name;
//	private String gender;
//	@Autowired
//	private Address address;
//	
//	
//
//	public Employee(String name, String gender, Address address)
//	{
//		super();
//		this.name = name;
//		this.gender = gender;
//		this.address = address;
//	}
//
//	public Employee() 
//	{
//		super();
//		System.out.println("Employee.Employee()");
//	}
//	
//	
//	public void afterPropertiesSet()throws Exception
//	{
//		System.out.println("Employee.afterPropertiesSet()");
//	}
//	
//	public void destroy()throws Exception
//	{
//		System.out.println("Employee.destroy()");
//	}
//	
//	private void xmlInitMethod()
//	{
//		System.out.println("Employee.xmlInitMethod()");
//	}
//	
//	private void xmlDestroyMethod()
//	{
//		System.out.println("Employee.xmlDestroyMethod()");
//	}
//
//	public String getName()
//	{
//		return name;
//	}
//
//	public void setName(String name) 
//	{
//		System.out.println("Employee.setName()");
//		this.name = name;
//	}
//
//	public String getGender() 
//	{
//		return gender;
//	}
//
//	public void setGender(String gender) 
//	{
//		this.gender = gender;
//	}
//
//	public Address getAddress() 
//	{
//		return address;
//	}
//
//	public void setAddress(Address address) 
//	{
//		this.address = address;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", gender=" + gender + ", address=" + address + "]";
//	}
//
//	
//
//	
//	
//	
//	
//	
//	
//}
