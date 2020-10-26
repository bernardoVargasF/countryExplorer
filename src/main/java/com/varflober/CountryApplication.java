package com.varflober;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.varflober" })
public class CountryApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(CountryApplication.class, args);
	}

}
