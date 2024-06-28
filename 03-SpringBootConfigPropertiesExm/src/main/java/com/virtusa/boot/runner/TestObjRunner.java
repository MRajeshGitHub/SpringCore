package com.virtusa.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.virtusa.boot.service.EmailService;

@Component
public class TestObjRunner implements CommandLineRunner {

	@Autowired
	private EmailService service;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("form runner ");
		System.out.println(service);
		
	}

}
