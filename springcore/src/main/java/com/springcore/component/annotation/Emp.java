package com.springcore.component.annotation;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("e1")
@Scope("prototype")
public class Emp {

	@Autowired
	private Address address;
	
	@Value("#{lang}")
	private Map<String, String>prgLanguages;
	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("in SetAddress");
		this.address = address;
	}




	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside default constructor");
	}
	
	
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}



	@Override
	public String toString() {
		return "Emp [address=" + address + ", prgLanguages=" + prgLanguages + "]";
	}



	
	
	
}
