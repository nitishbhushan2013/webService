package com.nitish.teach.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.nitish.teach.service.HelloService")
public class HelloServiceImpl implements HelloService{

	public void printHelloMessage(String name) {
		System.out.println("welcome!! "+name);
	}
}
