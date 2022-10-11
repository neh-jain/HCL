package org.alvas.spring_xml.constructor_injextion;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("constructor.xml");
		User user = (User) ac.getBean("myUser");
		System.out.println(user.id);
		System.out.println(user.name);
	}
}