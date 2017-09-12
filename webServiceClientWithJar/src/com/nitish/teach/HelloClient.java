package com.nitish.teach;

import com.nitish.teach.service.HelloService;
import com.nitish.teach.service.HelloServiceImplService;

public class HelloClient {

	public static void main(String[] args) {
		HelloServiceImplService service = new HelloServiceImplService();
		HelloService client = service.getHelloServiceImplPort();
		client.printHelloMessage("Super coder");
	}

}
