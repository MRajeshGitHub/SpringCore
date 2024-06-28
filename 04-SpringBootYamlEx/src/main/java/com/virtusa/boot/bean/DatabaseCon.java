package com.virtusa.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix ="my.db")
public class DatabaseCon {

	private String driver;
	private String url;
}
