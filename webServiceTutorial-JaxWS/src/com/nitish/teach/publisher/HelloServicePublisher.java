package com.nitish.teach.publisher;

import javax.xml.ws.Endpoint;

import com.nitish.teach.service.HelloServiceImpl;

public class HelloServicePublisher {

	public static void main(String[] args) {
		System.out.println("going to call web service");
		Endpoint.publish("http://localhost:9091/ws/helloService", new HelloServiceImpl());
	}

}
