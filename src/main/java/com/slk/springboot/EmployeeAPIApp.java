package com.slk.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class EmployeeAPIApp extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAPIApp.class, args);
	}
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EmployeeAPIApp.class);
    }

}
