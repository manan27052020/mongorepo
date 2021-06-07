package com.mongotemplate.mongotemplate.service;

import com.mongotemplate.mongotemplate.model.Employee;
import com.mongotemplate.mongotemplate.repository.EmployeeRepository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employee save(Employee emp) {
		emp.setJoiningDate(new Date());
		return repository.save(emp);
	}

	public List<Employee> getAll() {
		
		return repository.findAll();
	}

	public Employee update(Employee emp) {
		return repository.update(emp);
	}

	public long delete(Employee emp) {
		return repository.delete(emp);
	}

	public List<Employee> getBySalary(int salary) {
		return repository.findBySalary(salary);
	}

	public List<Employee> getByFirstName(String firstName) {
		return repository.getByFirstName(firstName);
	}
}
