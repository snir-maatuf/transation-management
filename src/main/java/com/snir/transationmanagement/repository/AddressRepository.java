package com.snir.transationmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.snir.transationmanagement.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
