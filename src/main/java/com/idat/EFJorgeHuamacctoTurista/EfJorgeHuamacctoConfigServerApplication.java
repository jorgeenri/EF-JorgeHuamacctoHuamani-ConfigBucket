package com.idat.EFJorgeHuamacctoTurista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfJorgeHuamacctoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJorgeHuamacctoConfigServerApplication.class, args);
	}

}
