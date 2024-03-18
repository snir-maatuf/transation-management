package com.snir.transationmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.snir.transationmanagement.model.Address;
import com.snir.transationmanagement.model.Employee;
import com.snir.transationmanagement.repository.EmployeeRepository;
import java.util.List;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressServices addressService;
	

	@Transactional
	public Employee addEmployee(Employee employee) throws Exception {
		Employee employeeSavedToDB = this.employeeRepository.save(employee);
		
		Address address = null;
		address.setId(1L);
		address.setAddress("Varanasi");
		address.setEmployee(employee);
		
		// calling addAddress() method of AddressService class
		this.addressService.addAddress(address);
		return employeeSavedToDB;
	}

	public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }
    
    public Employee getEmployeeById(int id) {
        return this.employeeRepository.findById(id).orElse(null);
    }

	@Transactional
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        Employee existingEmployee = this.employeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            // Update the existing employee's information
            existingEmployee.setName(updatedEmployee.getName());
            // Save the updated employee
            return this.employeeRepository.save(existingEmployee);
        }
        return null;
    }
    
    @Transactional
    public boolean deleteEmployee(int id) {
        Employee existingEmployee = this.employeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            // Delete the employee
            this.employeeRepository.delete(existingEmployee);
            return true;
        }
        return false;
    }
}
