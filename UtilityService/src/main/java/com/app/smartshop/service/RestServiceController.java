package com.app.smartshop.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.smartshop.service.io.AddCartRequest;
import com.app.smartshop.service.io.ItemsResponse;
import com.app.smartshop.service.io.LoginRequest;
import com.app.smartshop.service.io.ShowCartResponse;
import com.app.smartshop.service.io.UserProfileResponse;

@RestController
public class RestServiceController {

	@Autowired
	UtilityService service;

	@PostMapping(value = "/login")
	public ResponseEntity<UserProfileResponse> login(@Valid @RequestBody LoginRequest request) {
		return new ResponseEntity<UserProfileResponse>(service.getLoggedinUser(request), HttpStatus.OK);
	}

	@GetMapping(value = "/getAllProduct")
	public ResponseEntity<ItemsResponse> getAllProduct() {
		return new ResponseEntity<ItemsResponse>(service.getAllProducts(), HttpStatus.OK);
	}

	@GetMapping(value = "/trigerNotification")
	public void sendmail(@RequestParam String searchString) {
		service.sendNotification(searchString);
	}

	// API - Add Cart
	@PostMapping(value = "/addToCart")
	public void addCart(@RequestBody AddCartRequest request) {
		service.addToCart(request);
	}

	@GetMapping(value = "/showCart")
	public ResponseEntity<ShowCartResponse> showCart(@RequestParam String userId) {

		return new ResponseEntity<ShowCartResponse>(service.loadUsersCart(userId), HttpStatus.OK);
	}

	@GetMapping(value = "/finalCheckout")
	public ResponseEntity<String> finalCheckout(@RequestParam String userId) {

		return new ResponseEntity<String>(service.finalCheckout(userId),HttpStatus.OK);
	}

	// TODO : Below functionalities needs be implemented..
	/*
	 * @PostMapping(value = "/getUser") public ResponseEntity<UserProfileResponse>
	 * loadUser(@RequestBody LoginRequest request) { return new
	 * ResponseEntity<UserProfileResponse>(service.getUserDetails(request),
	 * HttpStatus.OK); } // TODO API
	 * 
	 * @PostMapping(value = "/register") public ResponseEntity<UserProfileResponse>
	 * register() { return new ResponseEntity<UserProfileResponse>(HttpStatus.OK); }
	 * 
	 * // TODO API
	 * 
	 * @PostMapping(value = "/resetPassword") public
	 * ResponseEntity<UserProfileResponse> resetPassword() { return new
	 * ResponseEntity<UserProfileResponse>(HttpStatus.OK); }
	 */

}
