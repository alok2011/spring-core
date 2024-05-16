package com.spring.spring_core.model;

public class Address 
{
	private String city;
	private String state;
	private String country;
	private int pinCode;
	
	public Address(String city, String state, String country, int pinCode) {
		super();
		System.out.println("Address.Address(4)");
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}
	
	public Address()
	{
		System.out.println("Address.Address()");
	}
	
	
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public String getState() 
	{
		return state;
	}
	
	

	public void setState(String state) 
	{
		this.state = state;
	}
	
	public String getCountry() 
	{
		return country;
	}
	
	public void setCountry(String country) 
	{
		this.country = country;
	}
	
	public int getPinCode() 
	{
		return pinCode;
	}
	
	public void setPinCode(int pinCode) 
	{
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
	
}
