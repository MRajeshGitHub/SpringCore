package com.virtusa.boot;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.aut")
public class Author {

	private String name;
	private String addr;
	
  
	List<Std> std;
	//Map<String, Author> map;
}
