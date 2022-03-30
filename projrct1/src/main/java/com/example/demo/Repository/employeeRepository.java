package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.employee;

public interface employeeRepository extends CrudRepository<employee, Integer> {

	


}
