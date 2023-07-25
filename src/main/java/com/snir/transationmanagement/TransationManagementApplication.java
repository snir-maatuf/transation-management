package com.snir.transationmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TransationManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransationManagementApplication.class, args);
	}

}
