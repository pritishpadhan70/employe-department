package com.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.pojo.Department;

@RestController
@CrossOrigin("*")
public class departmentController {
	
	@GetMapping(value = "/departments")
	public List<Department> getDepartments(){
		System.out.println("Departments Given.................");
		List<Department> dl = new ArrayList<Department>();
		dl.add(new Department(100,"DEVLOPER","A-block"));
		dl.add(new Department(101,"TESTER","B-block"));
		dl.add(new Department(100,"MANAGEMENT","C-block"));
		
		return dl;
	}
}
