package com.app.smartshop.service.io;

import com.sun.istack.NotNull;

public class LoginRequest {

	@NotNull
	private String username;
	
	@NotNull
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
