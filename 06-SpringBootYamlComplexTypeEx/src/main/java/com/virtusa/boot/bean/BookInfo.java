package com.virtusa.boot.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.book")
public class BookInfo {

	private String bname;
	
	private List<String> author;
	//private Set<String> author;
	//private String[] author;
	
	//private Map<String, String> versions;
	
	private Properties versions;
	
	private Publisher pob;//Has- a variable
}
