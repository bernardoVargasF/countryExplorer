package com.varflober;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(CountryApplication.class, args);
	}

}
