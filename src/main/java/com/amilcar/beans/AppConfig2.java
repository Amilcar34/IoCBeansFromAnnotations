package com.amilcar.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

	@Bean
	public Mundo metodoX() {
		return new Mundo();
	}

}
