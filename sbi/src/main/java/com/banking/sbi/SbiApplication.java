package com.banking.sbi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.banking")
@EntityScan(basePackages = "com.banking.entity")
@EnableJpaRepositories(basePackages = "com.banking.repository")
public class SbiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbiApplication.class, args);
	}

}
