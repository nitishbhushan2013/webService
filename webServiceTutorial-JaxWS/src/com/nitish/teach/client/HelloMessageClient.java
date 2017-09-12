package com.nitish.teach.client;

import java.net.URL;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.nitish.teach.service.HelloService;

public class HelloMessageClient {

	public static void main(String[] args) throws Exception{
		
		URL url = new URL("http://localhost:9091/ws/helloService?wsdl");
		QName qName = new QName("http://service.teach.nitish.com/","HelloServiceImplService");
		Service service = Service.create(url,qName);
		HelloService helloService = service.getPort(HelloService.class);
		helloService.printHelloMessage("Nitish");
	}

}
