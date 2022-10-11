package org.alvas.spring_xml.objectref_injextion;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopTest {
	public static void main(String[] args) {
	ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("objectref.xml");
	Laptop lap = (Laptop) ac.getBean("myLaptop");	
	lap.getLaptop();
	}
}
