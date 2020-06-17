package com.app.smartshop.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	private JavaMailSender javaMailSender;

	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public void sendMail() {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo("jayaraj.chevery@gmail.com");
		mailMessage.setSubject("PRODUCT NOT AVAILABLE");
		mailMessage.setText(
				"Customer is looking for the Product '##' is not available in the rack.. Please do the needfull immedialty.");
		mailMessage.setFrom("cjayaraj2@gmail.com");
		javaMailSender.send(mailMessage);
	}
}