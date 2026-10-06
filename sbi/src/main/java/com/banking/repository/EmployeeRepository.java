package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
