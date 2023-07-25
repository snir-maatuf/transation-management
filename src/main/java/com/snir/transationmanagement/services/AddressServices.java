package com.snir.transationmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.snir.transationmanagement.model.Address;
import com.snir.transationmanagement.repository.AddressRepository;

@Service
public class AddressServices {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Address addAddress(Address address) {
		Address addressSavedToDB = this.addressRepository.save(address);
		return addressSavedToDB;
	}

}
