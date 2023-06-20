package com.cindytech.iautoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class IautoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IautoserviceApplication.class, args);
	}

}
