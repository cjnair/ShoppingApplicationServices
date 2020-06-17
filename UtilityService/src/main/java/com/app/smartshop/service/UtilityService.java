package com.app.smartshop.service;

import com.app.smartshop.service.io.AddCartRequest;
import com.app.smartshop.service.io.ItemInfo;
import com.app.smartshop.service.io.ItemsResponse;
import com.app.smartshop.service.io.LoginRequest;
import com.app.smartshop.service.io.ShowCartResponse;
import com.app.smartshop.service.io.UserProfileResponse;

public interface UtilityService {

	public UserProfileResponse getUserDetails (LoginRequest request);
	
	public ItemsResponse getAllProducts();
	
	public ItemInfo getItemInfo(String itemcode);
	
	public void addToCart(AddCartRequest input);

	UserProfileResponse getLoggedinUser(LoginRequest request);
	
	public void sendNotification(String code);
	
	ShowCartResponse loadUsersCart(String userId);
	
	String finalCheckout(String userId);
	
}
