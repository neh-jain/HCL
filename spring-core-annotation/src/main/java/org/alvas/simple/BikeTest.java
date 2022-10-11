package org.alvas.simple;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeTest {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cac = new AnnotationConfigApplicationContext();
		Bike bike = (Bike) cac.getBean("myBike");
		bike.getBike();
		
	}

}
