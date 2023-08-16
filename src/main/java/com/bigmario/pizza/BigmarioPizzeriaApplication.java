package com.bigmario.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class BigmarioPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigmarioPizzeriaApplication.class, args);
	}

}
