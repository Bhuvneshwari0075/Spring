package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	@Autowired
	@Qualifier("address3")
	private Address address;
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		System.out.println("in SetAddress");
		this.address = address;
	}



	public Address getAddress1() {
		return address1;
	}



	public void setAddress1(Address address1) {
		System.out.println("in setAddress1");
		this.address1 = address1;
	}



	@Autowired
	@Qualifier("address34")
	private Address address1;

	
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
		return "Emp [address=" + address + ", address1=" + address1 + "]";
	}



	
	
	
}
