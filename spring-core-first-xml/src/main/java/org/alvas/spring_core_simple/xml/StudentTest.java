package org.alvas.spring_core_simple.xml;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		BeanFactory bf = new ClassPathXmlApplicationContext("myfriends.xml");				
		Student student = (Student) bf.getBean("myStudent");
		student.getStudent();
		
	}

}
