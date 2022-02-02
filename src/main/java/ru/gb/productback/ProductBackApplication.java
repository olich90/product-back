package ru.gb.productback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductBackApplication.class, args);
	}

}
