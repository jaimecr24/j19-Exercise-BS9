package com.exercise.ej31;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ej31Application {

	public static void main(String[] args) {
		SpringApplication.run(Ej31Application.class, args);
	}

}
