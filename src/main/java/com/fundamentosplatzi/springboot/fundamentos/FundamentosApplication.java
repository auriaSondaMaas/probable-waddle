package com.fundamentosplatzi.springboot.fundamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Encargado de inicializar toda la arquitectura y autoconfiguración del proyecto de SpringBoot
 */

@SpringBootApplication
public class FundamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

}
