package com.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.pojo.Employee;
@RestController
@CrossOrigin("*")
public class employeeController {

	@GetMapping(value = "/employees")
	public List<Employee> getEmployee(){
		System.out.println("Employees given ..........");
		List<Employee> el = new ArrayList<Employee>();
		el.add(new Employee(100,"Abhilash Sahu","DEVLOPER"));
		el.add(new Employee(101,"Rubul Sahu","TESTER"));
		el.add(new Employee(100,"Nebasish Pradhan","MANAGEMENT"));
		
		return el;
	}
}
