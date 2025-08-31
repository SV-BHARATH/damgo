
package com.example.SpringMailSender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.SpringMailSender.user.EmailSender;


@Service
public class EmailServiceImp implements EmailService
{
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String sender;
	

	@Override
	public String sendMail(EmailSender email) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(sender);
		message.setTo(sender);
		
		message.setText(email.getMsgBody());
		message.setSubject(email.getSubject());
		javaMailSender.send(message);
		return "Email Sent successfully";
	}

}
