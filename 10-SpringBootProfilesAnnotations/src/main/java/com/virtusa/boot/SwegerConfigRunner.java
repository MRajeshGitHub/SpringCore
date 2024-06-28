package com.virtusa.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("qa")
@Profile({"defaule","qa"})
public class SwegerConfigRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SWEGER CONGIG RUNNER./...");
		
	}

}
