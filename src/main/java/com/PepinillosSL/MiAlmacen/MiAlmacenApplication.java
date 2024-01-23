package com.PepinillosSL.MiAlmacen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.CreatedBy;

@SpringBootApplication
public class MiAlmacenApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiAlmacenApplication.class, args);
		System.out.println("HOLA MUNDO DE PEPINILLOS");
    
		System.out.println("UwU");
    
		System.out.println("HOLA MUNDO DE PEPINOS");
		System.out.println("HOLA MUNDO DE ISAAC");
		
		crearPepinillos();
	}
	
	private static void crearPepinillos() {
		System.out.println("PEPINILLOS CREADOS");
	}

}
