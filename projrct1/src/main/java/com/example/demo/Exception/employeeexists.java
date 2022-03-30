package com.example.demo.Exception;

public class employeeexists  extends Exception {
	
	private static final long serialVersionUID = 1L;
	public employeeexists() {
		System.out.println("The id already exits in the database");
	}
	
	public employeeexists(String s) {
		super(s);
	}

}


