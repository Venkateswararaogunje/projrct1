package com.example.demo.service;

import java.util.Comparator;

import com.example.demo.entity.employee;

public class ComparatorSort implements Comparator<employee> {
	 
	@Override
	public int compare(employee o1, employee o2) {
		if(o1.getSalary()>o2.getSalary()) {
			return -1;
		}
		else if(o1.getSalary()<o2.getSalary()) {
			return +1;
		}
		else {
			return o1.getName().compareTo(o2.getName());
		}
	}
	

}
