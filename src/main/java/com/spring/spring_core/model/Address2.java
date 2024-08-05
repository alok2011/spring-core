package com.spring.spring_core.model;

import org.springframework.stereotype.Component;

@Component(value = "address2")
public class Address2 implements IAddress
{
	private String city= "shimla";
	private String state= "UK";
	
	public Address2() 
	{
		super();
		System.out.println("Address2.Address2()");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address2 [city=" + city + ", state=" + state + "]";
	}


}