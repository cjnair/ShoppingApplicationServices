package com.app.smartshop.service;

import com.app.smartshop.service.io.ItemInfo;
import com.app.smartshop.service.io.ItemsResponse;
import com.app.smartshop.service.io.LoginRequest;
import com.app.smartshop.service.io.UserProfileResponse;

public interface UtilityService {

	public UserProfileResponse getUserDetails (LoginRequest request);
	
	public ItemsResponse getAllProducts();
	
	public ItemInfo getItemInfo(String itemcode);
}
