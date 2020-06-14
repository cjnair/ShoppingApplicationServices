package com.app.smartshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.smartshop.service.io.AddCartRequest;
import com.app.smartshop.service.io.ItemsResponse;
import com.app.smartshop.service.io.LoginRequest;
import com.app.smartshop.service.io.UserProfileResponse;

@RestController
public class RestServiceController {

	@Autowired
	UtilityService service;

	@PostMapping(value = "/login")
	public ResponseEntity<UserProfileResponse> loadUser(@RequestBody LoginRequest request) {

		return new ResponseEntity<UserProfileResponse>(service.getUserDetails(request), HttpStatus.OK);

	}

	@PostMapping(value = "/getAllProduct")
	public ResponseEntity<ItemsResponse> getAllProduct() {

		return new ResponseEntity<ItemsResponse>(service.getAllProducts(), HttpStatus.OK);

	}
	
	@PostMapping(value = "/addToCart")
	public void addCart(@RequestBody AddCartRequest request) {

		service.getAllProducts();

	}
	
	// Show Cart
}
