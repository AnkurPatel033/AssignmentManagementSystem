package com.xworkz.assignment.email;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.xworkz.assignment.entities.signup.SignUpEntity;

@Service
public class MailSender{

	@Autowired
	private JavaMailSender javaMailSender;
	public MailSender() {
	
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	public void mailSending(SignUpEntity entity,String upass)
	{
	
		System.out.println("invoked mailSending()...");
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		try {
			mailMessage.setTo(entity.getEmail());
			mailMessage.setSubject("Assignment Management Application"+"\n"+"SignUp Confirmation Mail...");
			mailMessage.setText("Hi... " + entity.getFname() + " You are Succefully SignUp!!!"+ "\n"+" Your Password is :"+upass);
			javaMailSender.send(mailMessage);
			System.out.println("Mail sent successfully");
		} catch (MailException e) {
			
			System.out.println("Exception thrown by MailSender:\t" + e.getMessage());
		}
	}
	
	public void changePassmailSending(String email,String upass,HttpServletRequest request)
	{
		System.out.println("invoked ChangePassmailSending()...");
	
	 

		SimpleMailMessage mailMessage1 = new SimpleMailMessage();
		try {
		//	System.out.println("entity:"+entity);
		//	String email1=entity.getEmail();
			System.out.println("Emailfor Chnage pass:"+email);
			mailMessage1.setTo(email);
			mailMessage1.setSubject("Assignment Management Application"+"\n"+"ChangePassword Confirmation Mail...");
			mailMessage1.setText("Hi... " + " You are Succefully ChnagePassword!!!"+ "\n"+" Your New Password is :"
					+ ""+upass);
			javaMailSender.send(mailMessage1);
			System.out.println("Mail sent successfully");
		} catch (MailException e) {
			System.out.println("Exception thrown by MailSender:\t" + e.getMessage());
		}
	}
	
	
}
