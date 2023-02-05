package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {

	private Samosa samosa;
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}



	public void study() {
		System.out.println("Hi");
		this.samosa.display();
	}
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	
}
