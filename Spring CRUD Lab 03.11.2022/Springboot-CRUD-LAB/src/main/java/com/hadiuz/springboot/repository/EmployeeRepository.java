package com.hadiuz.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hadiuz.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
