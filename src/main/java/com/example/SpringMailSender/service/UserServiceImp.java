

package com.example.SpringMailSender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringMailSender.dto.RegisterDto;
import com.example.SpringMailSender.repository.USerRepository;
import com.example.SpringMailSender.user.Register;

@Service
public class UserServiceImp implements UserService
{
	@Autowired
	private BCryptPasswordEncoder passwordencode;
	
	@Autowired
	private USerRepository repo;

	@Override
	public String saveDetails(RegisterDto registerDto) 
	{
		
		String reg= passwordencode.encode(registerDto.getPassword());
		
		Register register = new Register(registerDto.getName(),registerDto.getPhoneno(),registerDto.getState(),
				registerDto.getDistrict(),registerDto.getAcres(),registerDto.getEmail(),reg);
		
		repo.save(register);
		
		return "Details Saved Succesfull";
	}

	
	

}
