package com.virtusa.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.virtusa.boot.Author;

import lombok.Data;

@Component
@Data

public class TestObjRunner implements CommandLineRunner {

	@Autowired
	private Author ar;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Rnner TEst....");
		System.out.println(ar);
		
		
		
		

	}

}
