package com.mallesh.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("com.mallesh.*") // Scan for components
@EntityScan(basePackages = {"com.mallesh.Entity"})  // Scan for JPA entities
@EnableJpaRepositories(basePackages = {"com.mallesh.serviceimpl"})
@EnableAspectJAutoProxy
 @EnableScheduling 
 

public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

}
