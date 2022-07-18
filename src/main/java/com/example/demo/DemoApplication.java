package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableJpaAuditing
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		SpringApplication.run(DemoApplication.class, args);
	}

}
