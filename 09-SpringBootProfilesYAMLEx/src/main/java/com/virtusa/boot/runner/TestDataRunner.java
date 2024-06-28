package com.virtusa.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.virtusa.boot.bean.MyDbCon;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private MyDbCon con;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("form runner test...");
		System.out.println(con);
		
	}

}
