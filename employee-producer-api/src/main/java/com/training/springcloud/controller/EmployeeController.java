package com.training.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.springcloud.model.Employee;
import com.training.springcloud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee returnEmployee() {

		return employeeService.newEmployee();

	}

}
