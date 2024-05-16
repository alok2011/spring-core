package com.spring.spring_core.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee 
{
	private String name;
	private String gender;
	private Address address;
	private List list;
	private Set set;
	private Map map;
	
	

	public Employee(String name, String gender, Address address, List list, Set set, Map map)
	{
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.list = list;
		this.set = set;
		this.map = map;
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

	public void setAddress(Address address) 
	{
		this.address = address;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", address=" + address + ", list=" + list + ", set="
				+ set + ", map=" + map + "]";
	}

	
	
	
	
	
	
}
