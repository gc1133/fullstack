package com.infosys.fullstack.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.fullstack.entities.Employees;
import com.infosys.fullstack.repositories.EmployeesRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeesRepository employeesRepository;

	public void createEmployee(Employees e1) {
		employeesRepository.save(e1);
	}

	public List<Employees> getAllEmployees() {
		return (List<Employees>) employeesRepository.findAll();
	}

}
