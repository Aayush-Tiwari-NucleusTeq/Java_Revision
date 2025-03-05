package com.core.rev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.core.rev.entities.Calculator;

@SpringBootApplication
public class JavaCoreRevAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCoreRevAppApplication.class, args);
		
		Calculator.master();
	}

}
