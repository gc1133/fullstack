package com.infosys.fullstack.repositories;

import org.springframework.data.repository.CrudRepository;

import com.infosys.fullstack.entities.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}
