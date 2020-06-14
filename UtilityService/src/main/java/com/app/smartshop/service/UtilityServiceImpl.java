package com.app.smartshop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.smartshop.service.entity.Product;
import com.app.smartshop.service.entity.Users;
import com.app.smartshop.service.io.ItemInfo;
import com.app.smartshop.service.io.ItemsResponse;
import com.app.smartshop.service.io.LoginRequest;
import com.app.smartshop.service.io.UserProfileResponse;
import com.app.smartshop.service.repo.ProductRespository;
import com.app.smartshop.service.repo.UsersRespository;

@Service
public class UtilityServiceImpl implements UtilityService {

	@Autowired
	UsersRespository userRepository;

	@Autowired
	ProductRespository productRepository;

	@Override
	public UserProfileResponse getUserDetails(LoginRequest request) {
		UserProfileResponse response = new UserProfileResponse();
		// String hashValue="Xyz@123";
		Users user = userRepository.findByEmailUsers(request.getUsername());
		response.setEmail(user.getEmail());
		response.setFirstName(user.getFirstName());
		response.setLastName(user.getLastName());
		response.setGender(user.getGender());
		response.setResponse("SUCCESS");
		response.setPhone(user.getPhone());
		response.setStatus("ACTIVE");
		return response;
	}

	@Override
	public ItemsResponse getAllProducts() {
		ItemsResponse response = new ItemsResponse();
		response.setItemdetails(new ArrayList<ItemInfo>());
		List<Product> list = (List<Product>) productRepository.findAll();
		for (Product product : list) {
			ItemInfo info = new ItemInfo();
			info.setItemCode(product.getItemCode());
			info.setItemName(product.getItemName());
			info.setAvailable(product.isAvailable());
			info.setQuantity(product.getQuantity());
			response.getItemdetails().add(info);
		}
		return response;
	}

	@Override
	public ItemInfo getItemInfo(String itemcode) {
		// TODO Auto-generated method stub
		return null;
	}

}
