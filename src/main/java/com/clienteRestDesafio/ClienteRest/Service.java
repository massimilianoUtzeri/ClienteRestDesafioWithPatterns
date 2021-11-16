package com.clienteRestDesafio.ClienteRest;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

	public class Service{
		
		Logger logger = LoggerFactory.getLogger(Service.class);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/";
		String openEndPoint ="open";
		String halfOpenEndPoint ="half-open";
		String closeEndPoint ="close";
		
		
		public String setToOpen() {
			String fooResourceUrl = url+openEndPoint;
			ResponseEntity<String> response = restTemplate.getForEntity(URI.create(fooResourceUrl), String.class);
			logger.info("El estado es:"+openEndPoint);
			return response.getBody();
		}
		
		public String setToClose() {
			String fooResourceUrl = url+closeEndPoint;
			ResponseEntity<String> response = restTemplate.getForEntity(URI.create(fooResourceUrl), String.class);
			logger.info("El estado es:"+closeEndPoint);
			return response.getBody();
		}
		
		public String setToHalfOpen() {
			String fooResourceUrl = url+halfOpenEndPoint;
			ResponseEntity<String> response = restTemplate.getForEntity(URI.create(fooResourceUrl), String.class);
			logger.info("El estado es:"+halfOpenEndPoint);
			return response.getBody();
		}
}
