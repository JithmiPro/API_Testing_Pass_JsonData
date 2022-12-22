package com.example.Pro01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.Ordered;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;


@SpringBootApplication
public class Pro01Application {

	public static void main(String[] args) {
		SpringApplication.run(Pro01Application.class, args);
	}


}

