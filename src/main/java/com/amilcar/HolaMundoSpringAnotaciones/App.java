package com.amilcar.HolaMundoSpringAnotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amilcar.beans.AppConfig;
import com.amilcar.beans.AppConfig2;
import com.amilcar.beans.Mundo;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext aC = new AnnotationConfigApplicationContext();
		aC.register(AppConfig.class);
		aC.register(AppConfig2.class);
		aC.refresh();

		Mundo m =(Mundo) aC.getBean("mundo");
		System.out.println(m.getHola());
		
		m =(Mundo) aC.getBean("metodoX");
		System.out.println(m.getHola());
		
		
		
		((ConfigurableApplicationContext)aC).close();
	}

}
