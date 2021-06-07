package com.mongotemplate.mongotemplate.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongotemplate.mongotemplate.model.Employee;
import com.mongotemplate.mongotemplate.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/")
	public Employee save(@RequestBody Employee emp) {
		return service.save(emp);
	}
	
	@GetMapping("/")
	public List<Employee> getAll(){
		return service.getAll();
	}
	
	@PutMapping("/")
	public Employee update(@RequestBody Employee emp) {
		return service.update(emp);
	}
	
	@GetMapping("/salary")
	public List<Employee> getBySalary(@PathParam("salary") int salary){
		return service.getBySalary(salary);
	}
	
	@GetMapping("/firstname")
	public List<Employee> getByFirstName(@PathParam("firstname") String firstName){
		return service.getByFirstName(firstName);
	}
	@DeleteMapping("/")
	public long delete(@RequestBody Employee emp) {
		return service.delete(emp);
	}
	
}
