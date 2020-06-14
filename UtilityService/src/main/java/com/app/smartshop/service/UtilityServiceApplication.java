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
	    	
	      // save a few Products
	      repository.save(new Product("PR001", "Fossil Smartwatch", "Fossil Men Gen 4 Explorist HR Heart Rate Stainless Steel Touchscreen Smartwatch", "image", BigDecimal.valueOf(10000.00),
					true, 100, "First", "RA01"));
	      repository.save(new Product("PR002", "Silicone Smartwatch", "Wenger Men's City Active Swiss Quartz Stainless Steel and Silicone Casual Watch", "image", BigDecimal.valueOf(10000.00),
					true, 100, "First", "RA01"));
	      repository.save(new Product("PR003", "Three Dots Lifestyle", "Touchscreen Bluetooth Smart Watch for Men Boys Girls.args.", "image", BigDecimal.valueOf(10000.00),
					true, 100, "First", "RA01"));
	      repository.save(new Product("PR004", "Micacchi", "Description.........", "image", BigDecimal.valueOf(10000.00),
					true, 100, "First", "RA01"));
	      repository.save(new Product("PR005", "Fastrack", "Description.........", "image", BigDecimal.valueOf(10000.00),
					true, 100, "First", "RA01"));
	      repository.save(new Product("PR006", "Arrow Sports", "Description.........", "image", BigDecimal.valueOf(500.00),
					true, 100, "First", "RA10"));
	      repository.save(new Product("PR007", "Flying Machine", "Description.........", "image", BigDecimal.valueOf(10000.00),
					true, 100, "First", "RA11"));
	      repository.save(new Product("PR0008", "Casio", "Description.........", "image", BigDecimal.valueOf(10000.00),
					true, 100, "First", "RA01"));
	      repository.save(new Product("PR09", "Kraasa", "Printed Casual Sneakers", "image", BigDecimal.valueOf(10000.00),
					true, 100, "First", "RA08"));
	      repository.save(new Product("PR010", "Guitar", "Description.........", "image", BigDecimal.valueOf(10000.00),
					true, 100, "First", "RA25"));
	      
	      userRepository.save(new Users("CUS001","cjayaraj","Jayaraj", "Chevery", "jayaraj.chevery@gmail.com", "", "Male", "9632896726",
					"ACTIVE"));
	      
	      userRepository.save(new Users("CUS002","priyanda","Priyanda", "L", "priyanda.l@gmail.com", "", "Male", "9632896726",
					"ACTIVE"));
	      
	    };
	    
	  
}
}	 