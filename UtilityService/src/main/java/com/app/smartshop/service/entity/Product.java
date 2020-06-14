package com.app.smartshop.service.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String itemCode;

	private String itemName;

	private String itemDetails;

	private String itemImage;

	private BigDecimal price;

	private boolean isAvailable;

	private int quantity;

	private String floorDetails;

	private String rackDetails;

	public Product() {

	}

	public Product(String itemCode, String itemName, String itemDetails, String itemImage, BigDecimal price,
			boolean isAvailable, int quantity, String floorDetails, String rackDetails) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemDetails = itemDetails;
		this.itemImage = itemImage;
		this.price = price;
		this.isAvailable = isAvailable;
		this.quantity = quantity;
		this.floorDetails = floorDetails;
		this.rackDetails = rackDetails;
	}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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
