package com.virtusa.boot.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data

public class Publisher {

	private Integer pid;
	private String pcode;
	private boolean active;
}
