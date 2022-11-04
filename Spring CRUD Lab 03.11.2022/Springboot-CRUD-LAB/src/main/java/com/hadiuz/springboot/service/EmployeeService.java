package com.hadiuz.springboot.service;

import java.util.List;

import com.hadiuz.springboot.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
}
