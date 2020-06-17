package com.app.smartshop.service.io;

import java.math.BigDecimal;

public class ItemInfo {

    private Long id;
    private String productName;
    private String description;
    private Long avlQty;
    private String location;
    private BigDecimal price;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getAvlQty() {
		return avlQty;
	}
	public void setAvlQty(Long avlQty) {
		this.avlQty = avlQty;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	
	
}