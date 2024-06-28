package com.virtusa.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.virtusa.boot.product.ProductInfo;

@Component
public class TestProductRunner implements CommandLineRunner {

	@Autowired
	private ProductInfo pif;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("form runner....");
		System.out.println(pif);
	}

}
