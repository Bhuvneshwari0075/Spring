package com.springcore.component.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("New Street")
	private String street;
	
	@Value("Delhi")
	private String city;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("hi");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}
