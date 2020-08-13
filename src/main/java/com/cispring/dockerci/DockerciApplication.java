package com.cispring.dockerci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.cispring.dockerci.repository")
@SpringBootApplication
public class DockerciApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerciApplication.class, args);
	}

}
