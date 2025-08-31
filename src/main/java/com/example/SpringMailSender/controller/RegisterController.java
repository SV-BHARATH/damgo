
package com.example.SpringMailSender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringMailSender.dto.RegisterDto;
import com.example.SpringMailSender.service.UserService;

@RestController
public class RegisterController 
{
	@Autowired
	private UserService userService;
	
	@PostMapping("/SaveData")
	public ResponseEntity<String> saveDetails(@RequestBody RegisterDto registerDto){
		
		return ResponseEntity.ok(userService.saveDetails(registerDto));
	}
	

}
