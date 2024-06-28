package com.virtusa.boot.product;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.virtusa.boot.vendor.Vandor;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix ="my.app")
public class ProductInfo {

	private String pcode;
	private int pid;
	private double pcost;
	
	private List<String> color;
	private Map<String, String> models;
	
	private Vandor vob;
}
