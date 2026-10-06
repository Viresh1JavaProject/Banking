package com.banking.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.entity.Employee;
import com.banking.repository.EmployeeRepository;
import com.banking.service.UpdateEmployee;

@Service
public class UpdateServiceimple implements UpdateEmployee {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee UpdateData(int id, Employee employee) {
		Employee existEmployee = employeeRepository.findById(id).orElse(null);

		if (existEmployee != null) {
			existEmployee.setName(employee.getName());
			existEmployee.setCity(employee.getCity());
			existEmployee.setDept(employee.getDept());
			existEmployee.setSalary(employee.getSalary());

			return employeeRepository.save(existEmployee);
		}
		return null;
	}

}
