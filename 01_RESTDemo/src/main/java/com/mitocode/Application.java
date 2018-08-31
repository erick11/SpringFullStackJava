package com.mitocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 @SpringBootApplication= se recomienda poner al inicio del paquete basico
 es decir en la raiz. 
 package com.mitocode;
 package com.mitocode.controller;
 package com.mitocode.service;
 
 Nota: Realiza un barrido de desde "com.mitocode"
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
