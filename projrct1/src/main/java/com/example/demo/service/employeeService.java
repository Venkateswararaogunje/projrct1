package com.example.demo.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.employeeRepository;
import com.example.demo.entity.employee;

@Service

public class employeeService {
	@Autowired
	private employeeRepository repo;
	
	public employee saveemployee(employee s) {
		return repo.save(s);
	}
	public List<employee> getAllemployee() {
		return (List<employee>) repo.findAll();
		
	}
	public Optional<employee> getemployeeById(Integer id) {
		return repo.findById(id);
	}
	public employee updateemployee(int id, double salary) {
    	employee existingemployee = repo.findById(id).orElse(null);
    	existingemployee.setSalary(salary);
    	return repo.save(existingemployee);
    	
    }
	public void deleteemployee(Integer id) {
		repo.deleteById(id);
	}
	public List<employee> sort() {
		List<employee> l=(List<employee>) repo.findAll();
		Collections.sort(l,new ComparatorSort());
		return l;
	}
	public void deleteemployeeById(Integer id) {
		repo.deleteById(id);
		
	}
	public List<employee> fetchemployeeList() {
		return (List<employee>) repo.findAll();
	
	}
	
	
	 
	
	}
	
