package com.example.Hibernate_mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class HibernateMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMysqlApplication.class, args);
	}

}