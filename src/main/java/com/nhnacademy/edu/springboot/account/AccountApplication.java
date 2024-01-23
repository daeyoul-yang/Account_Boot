package com.nhnacademy.edu.springboot.account;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(AccountApplication.class);

		application.run(args);


	}

}
