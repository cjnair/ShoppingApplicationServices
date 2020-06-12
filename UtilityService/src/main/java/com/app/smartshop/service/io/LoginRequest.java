package com.app.smartshop.service.io;

public class LoginRequest {

	private String username;
	private String secretCode;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getSecretCode() {
		return secretCode;
	}
	
	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}
	
	
}
