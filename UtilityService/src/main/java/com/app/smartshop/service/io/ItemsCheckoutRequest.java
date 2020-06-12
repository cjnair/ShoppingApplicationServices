package com.app.smartshop.service.io;

import java.util.List;

public class ItemsCheckoutRequest {
	
	List<ItemInfo> itemdetails;

	public List<ItemInfo> getItemdetails() {
		return itemdetails;
	}

	public void setItemdetails(List<ItemInfo> itemdetails) {
		this.itemdetails = itemdetails;
	}
}
