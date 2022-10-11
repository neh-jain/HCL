package org.alvas.controller;

import org.alvas.dto.Student;
import org.alvas.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {

	@Autowired
	static Student student;
	@Autowired
	static StudentService service;
	
	public static void main(String[] args) {
		student.setId(1000);
		student.setName("Risab");
		student.setEmail("r@gmail.com");
		service.saveStudent(student);

	}
}