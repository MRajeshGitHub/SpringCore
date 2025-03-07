package com.virtusa.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.app.db")
public class MyDbCon {

	private String driver;
	private String url;
	
}
