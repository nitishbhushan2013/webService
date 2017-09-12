package com.nitish.teach.client;

import com.nitish.teach.service.HelloService;
import com.nitish.teach.service.HelloServiceImplService;

public class HelloServiceClient {

	public static void main(String[] args) {
		HelloServiceImplService  helloService = new  HelloServiceImplService();
		HelloService client = helloService.getHelloServiceImplPort();
		client.printHelloMessage("Nitish Bhushan");

	}

}
