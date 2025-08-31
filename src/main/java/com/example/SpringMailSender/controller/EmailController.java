package com.example.SpringMailSender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringMailSender.service.EmailService;
import com.example.SpringMailSender.user.EmailSender;

@RestController
public class EmailController 
{
	@Autowired
	private EmailService emailService;
	
	
	private EmailSender email;
	
	
	@PostMapping("/SendMail")
	public ResponseEntity<String> sendMail(@RequestBody EmailSender email){
		
		return ResponseEntity.ok(emailService.sendMail(email));	
				}

}
