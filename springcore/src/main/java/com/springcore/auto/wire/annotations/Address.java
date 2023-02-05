package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Address {
	private String street;
	
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
