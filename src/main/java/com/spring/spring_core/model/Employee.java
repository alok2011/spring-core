package com.spring.spring_core.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	private int id =101;
	private String name="Alok";
	private int salary = 10_000;
	
	
	private IAddress adddress;
	
	public Employee() 
	{
		System.out.println("Employee.Employee()");
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(IAddress address) {
		this.adddress=address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public IAddress getAdddress() {
		return adddress;
	}
	@Autowired
	@Qualifier("address2")   // if we want to autowire byName then Spring provides @Qualifier Annotation which is the sub tag of @Autowired Annotation
	public void setAdddress(IAddress adddress) {
		System.out.println("Employee.setAdddress()");
		this.adddress = adddress;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", adddress=" + adddress + "]";
	}
	
	
}
