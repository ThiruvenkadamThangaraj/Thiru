package com.springboot.codedecode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.codedecode.entity.Employee;
import com.springboot.codedecode.respos.EmployeeCrudRepo;

@RestController
@RequestMapping("/code")
public class EmployeeController {
	
	@Autowired 
	EmployeeCrudRepo empCrud;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		System.out.println("get all the employees");
		System.out.println( empCrud.findAll().size());
		return empCrud.findAll();
	}

}
