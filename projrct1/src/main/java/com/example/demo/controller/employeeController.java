package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.employeeexists;
import com.example.demo.entity.employee;
import com.example.demo.service.ComparatorSort;
import com.example.demo.service.employeeService;

import java.util.Collections;
import java.util.List;

@RestController


public class employeeController {
 
    
    @Autowired 
    private employeeService EmployeeService;
    
    @PostMapping("/saveemployees")
    public employee saveemployee(@RequestBody employee Employee)
    {
        return EmployeeService.saveemployee(Employee);
    }
 
    
    @GetMapping("/employees")
    public List<employee> fetchemployeeList()
    {
        return EmployeeService.fetchemployeeList();
    }
 
    @GetMapping("employeessort")
    public List<employee> fetchemployeeList1() {
    	List<employee> Employeelist = EmployeeService.fetchemployeeList();
    	Collections.sort(Employeelist, new ComparatorSort());
    	return Employeelist;
    }
    @PutMapping("/employees/{id}/{salary}")
    public employee updateemployee(@RequestBody employee Employee,@PathVariable Integer id,@PathVariable double salary)
    {
        return EmployeeService.updateemployee(id, salary);
    }
 
    
    @DeleteMapping("/employees/{id}")
    public String deleteemployeeById(@PathVariable("id") Integer Id)
    {
        EmployeeService.deleteemployeeById(Id);
        return "Deleted Successfully";
    }
}

