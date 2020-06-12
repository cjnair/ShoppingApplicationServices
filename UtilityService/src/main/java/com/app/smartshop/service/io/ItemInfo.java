package com.app.smartshop.service.io;

import java.math.BigDecimal;

public class ItemInfo {

	private String itemCode;
	
	private String itemName;
	
	private String itemDetails;
	
	private String itemImage;
	
	private BigDecimal price; 
	
	private boolean isAvailable;
	
	private int quantity;
	
	private String floorDetails;
	
	private String rackDetails;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}

	public String getItemImage() {
		return itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getQuantity() {
		return quantity;
	}
	

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getFloorDetails() {
		return floorDetails;
	}

	public void setFloorDetails(String floorDetails) {
		this.floorDetails = floorDetails;
	}

	public String getRackDetails() {
		return rackDetails;
	}

	public void setRackDetails(String rackDetails) {
		this.rackDetails = rackDetails;
	}
	
}