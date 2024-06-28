package com.virtusa.boot.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.virtusa.boot.message.Message;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.app")
public class EmailService {

	private String host;
	private int port;
	private String username;
	private boolean active;
	
	//private List<String> model;
	//private Set<String> model;
	private String[] model;
	
	private Map<String, String> data;
	
	private Message mob;//ref variable or Has-A relation
}
