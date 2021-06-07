package com.mongotemplate.mongotemplate.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongotemplate.mongotemplate.model.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	public Employee save(Employee emp) {
		return mongoTemplate.save(emp);
	}

	public List<Employee> findAll() {
		return mongoTemplate.findAll(Employee.class);
	}

	public Employee update(Employee emp) {
		return mongoTemplate.save(emp);
	}

	public long delete(Employee emp) {

		return mongoTemplate.remove(emp).getDeletedCount();
	}

	public List<Employee> findBySalary(int salary) {
		Query query = new Query(Criteria.where("salary").lt(salary));
		return mongoTemplate.find(query, Employee.class);
	}

	public List<Employee> getByFirstName(String firstName) {
		Query query = new Query(Criteria.where("firstName").regex("^" + firstName));
		return mongoTemplate.find(query, Employee.class);
	}
}
