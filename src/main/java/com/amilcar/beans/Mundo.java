package com.amilcar.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {

	@Value("Hola desde la clase Mundo")  //este value equivale a: Private String hola = "Hola desde la clase Mundo";
	private String hola;
	
	private String saludo;
	

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String getHola() {
		return hola;
	}

	public void setHola(String hola) {
		this.hola = hola;
	}
	
}
