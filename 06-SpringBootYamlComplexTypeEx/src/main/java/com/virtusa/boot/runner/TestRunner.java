package com.virtusa.boot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.virtusa.boot.bean.BookInfo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private BookInfo binfo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("form runner test");
		System.out.println(binfo);
		System.out.println(binfo.getAuthor().getClass().getName());
		System.out.println(binfo.getVersions().getClass().getName()       );
	}

}
