package com.nitish.teach.client;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class GlobalWeatherApp {

	public static void main(String[] args) {
		GlobalWeather service = new GlobalWeather();
		GlobalWeatherSoap client = service.getGlobalWeatherSoap();
		System.out.println(client.getCitiesByCountry("Australia"));

	}

}
