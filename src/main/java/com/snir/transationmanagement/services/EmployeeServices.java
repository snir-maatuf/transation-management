package com.snir.transationmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.snir.transationmanagement.model.Address;
import com.snir.transationmanagement.model.Employee;
import com.snir.transationmanagement.repository.EmployeeRepository;

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
}
