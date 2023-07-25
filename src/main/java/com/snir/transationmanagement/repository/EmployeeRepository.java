package com.snir.transationmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.snir.transationmanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
