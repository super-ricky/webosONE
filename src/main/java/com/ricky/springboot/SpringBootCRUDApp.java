package com.ricky.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.context.annotation.Import;

@Import(JpaBaseConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.ricky.springboot"})
public class SpringBootCRUDApp {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootCRUDApp.class, args);
	}

}
