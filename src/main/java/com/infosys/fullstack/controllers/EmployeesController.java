package com.infosys.fullstack.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.fullstack.entities.Employees;
import com.infosys.fullstack.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAll")
	public List<Employees> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/create")
	public void createEmployee() {
		Employees e1 = new Employees("Gaurav", "Chhabra");
		employeeService.createEmployee(e1);
	}

}
