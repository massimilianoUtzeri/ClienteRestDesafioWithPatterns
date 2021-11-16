package com.clienteRestDesafio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clienteRestDesafio.ClienteRest.Service;

@SpringBootApplication
public class ClienteRestDesafioWithPatternsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClienteRestDesafioWithPatternsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Service service = new Service();
		
		String open = "open";
		String close = "close";
		String halfOpen = "half-open";
		
		//Falta implementar el ciclo for
	}

}
