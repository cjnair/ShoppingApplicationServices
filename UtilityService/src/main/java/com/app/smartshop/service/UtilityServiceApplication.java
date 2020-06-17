package com.app.smartshop.service;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.smartshop.service.entity.Product;
import com.app.smartshop.service.entity.Users;
import com.app.smartshop.service.repo.ProductRespository;
import com.app.smartshop.service.repo.UsersRespository;

@SpringBootApplication
public class UtilityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilityServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ProductRespository repository, UsersRespository userRepository) {
		return (args) -> {

			// Load Few Products
			repository.save(new Product("Fossil Smartwatch",
					"Fossil Men Gen 4 Explorist HR Heart Rate Stainless Steel Touchscreen Smartwatch",
					Long.valueOf(100), "RA01", BigDecimal.valueOf(10000.00)));

			repository.save(new Product("Silicone Smartwatch",
					"Wenger Men's City Active Swiss Quartz Stainless Steel and Silicone Casual Watch",
					Long.valueOf(100), "RA01", BigDecimal.valueOf(10000.00)));
			repository.save(
					new Product("Three Dots Lifestyle", "Touchscreen Bluetooth Smart Watch for Men Boys Girls.args.",
							Long.valueOf(100), "RA01", BigDecimal.valueOf(10000.00)));
			repository.save(new Product("Micacchi", "Description.........", Long.valueOf(100), "RA01",
					BigDecimal.valueOf(10000.00)));
			repository.save(new Product("Fastrack", "Description.........", Long.valueOf(100), "RA01",
					BigDecimal.valueOf(10000.00)));
			repository.save(new Product("Arrow Sports", "Description.........", Long.valueOf(100), "RA01",
					BigDecimal.valueOf(10000.00)));
			repository.save(new Product("Flying Machine", "Description.........", Long.valueOf(100), "RA01",
					BigDecimal.valueOf(10000.00)));
			repository.save(new Product("Casio", "Description.........", Long.valueOf(100), "RA01",
					BigDecimal.valueOf(10000.00)));
			repository.save(new Product("Kraasa", "Printed Casual Sneakers", Long.valueOf(100), "RA01",
					BigDecimal.valueOf(10000.00)));
			repository.save(new Product("Guitar", "Description.........", Long.valueOf(100), "RA01",
					BigDecimal.valueOf(10000.00)));

			// Load Few Users
			userRepository.save(new Users("CUS001", "cjayaraj", "Jayaraj", "Chevery", "jayaraj.chevery@gmail.com", "",
					"Male", "9632896726", "ACTIVE"));

			userRepository.save(new Users("CUS002", "priyanda", "Priyanda", "L", "priyanda.l@gmail.com", "", "Male",
					"9632896726", "ACTIVE"));

		};

	}
}