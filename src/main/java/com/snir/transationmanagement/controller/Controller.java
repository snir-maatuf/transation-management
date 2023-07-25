package com.snir.transationmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snir.transationmanagement.model.Employee;
import com.snir.transationmanagement.services.EmployeeServices;

@RestController
@RequestMapping("/api/employee")
public class Controller {
	
	@Autowired
	private EmployeeServices employeeServices;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) throws Exception{
		Employee employeeSavedToDB = this.employeeServices.addEmployee(employee);
		return new ResponseEntity<Employee>(employeeSavedToDB, HttpStatus.CREATED);
	}
}
