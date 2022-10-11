package org.alvas.service;

import org.alvas.dto.Student;
import org.alvas.dto.Studentdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="")
public class StudentService {
	
	@Autowired
	Studentdao studentdao;
	public Student saveStudent(Student student)
	{
		
		return studentdao.saveStudent(student);
	}

}
