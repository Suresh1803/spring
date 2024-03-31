package com.techietact.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techietact.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
	  Employee findByAddress(String address);
}
