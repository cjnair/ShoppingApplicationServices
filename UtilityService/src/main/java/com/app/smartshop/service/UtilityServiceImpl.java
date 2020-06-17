package com.app.smartshop.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.smartshop.service.entity.Cart;
import com.app.smartshop.service.entity.Product;
import com.app.smartshop.service.entity.Users;
import com.app.smartshop.service.io.AddCartRequest;
import com.app.smartshop.service.io.ItemInfo;
import com.app.smartshop.service.io.ItemsResponse;
import com.app.smartshop.service.io.LoginRequest;
import com.app.smartshop.service.io.ShowCartResponse;
import com.app.smartshop.service.io.UserProfileResponse;
import com.app.smartshop.service.repo.CartRespository;
import com.app.smartshop.service.repo.ProductRespository;
import com.app.smartshop.service.repo.UsersRespository;

@Service
public class UtilityServiceImpl implements UtilityService {

	@Autowired
	private EmailService emailService;

	@Autowired
	UsersRespository userRepository;

	@Autowired
	ProductRespository productRepository;

	@Autowired
	CartRespository cartRepository;

	private static String TEMP_CODE = "12345";

	@Override
	public UserProfileResponse getLoggedinUser(LoginRequest request) {

		UserProfileResponse response = new UserProfileResponse();
		// TODO : Temporary Implementation
		if (!request.getPassword().equals(TEMP_CODE)) {
			return response;
		}

		Users user = userRepository.findByEmailUsers(request.getUsername());
		if (null != user) {
			response.setUserId(user.getUserId());
			response.setToken("ASDAADADAADADA_DHJDHAHDH_SDSJDBSD_SDSK_JSDJ");
		}
		return response;
	}

	@Override
	public ItemsResponse getAllProducts() {
		ItemsResponse response = new ItemsResponse();
		response.setItemdetails(new ArrayList<ItemInfo>());
		List<Product> list = (List<Product>) productRepository.findAll();
		for (Product product : list) {
			ItemInfo info = new ItemInfo();
			info.setAvlQty(product.getAvlQty());
			info.setDescription(product.getDescription());
			info.setId(product.getId());
			info.setLocation(product.getLocation());
			info.setPrice(product.getPrice());
			info.setProductName(product.getProductName());
			response.getItemdetails().add(info);
		}
		return response;
	}

	@Override
	public void sendNotification(String code) {
		emailService.sendMail();
	}

	@Override
	public void addToCart(AddCartRequest input) {
		Cart cart = new Cart();
		cart.setItemCode("");
		cart.setPrice(BigDecimal.valueOf(100));
		cart.setQuantity(1);
		cart.setUserId(input.getUserId());
		cart.setItemName(input.getItemName());
		cartRepository.save(cart);

	}

	@Override
	public ShowCartResponse loadUsersCart(String userId) {
		ShowCartResponse response = new ShowCartResponse();
		List<String> items = null;
		List<Cart> userCartItems = cartRepository.findAllByUsers(userId);
		if (!userCartItems.isEmpty()) {
			items = new ArrayList<String>();
			for (Cart item : userCartItems) {
				items.add(item.getItemName());
			}
			response.setCartItems(items);
		}
		return response;
	}

	@Override
	public String finalCheckout(String userId) {
		StringBuilder sb = new StringBuilder();
		List<Cart> userCartItems = cartRepository.findAllByUsers(userId);
		BigDecimal price = new BigDecimal(0);
		Integer count = 1;
		if (!userCartItems.isEmpty()) {
			for (Cart item : userCartItems) {
				price = price.add(item.getPrice());
				sb.append(+count++ +": ").append(item.getItemName()).append(" Qnty : ").append(item.getQuantity())
						.append(" Price: ").append(item.getPrice()).append("\n");
			}
			sb.append("***** Order Total : ").append(price).append("**********");

		}
		return sb.toString();
	}

	@Override
	public UserProfileResponse getUserDetails(LoginRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemInfo getItemInfo(String itemcode) {
		// TODO Auto-generated method stub
		return null;
	}

}
