package org.practicaltest.service.question3;

import java.util.Arrays;

import org.practicaltest.dao.question3.StudentDAO;
import org.practicaltest.model.question1.Student;

public class StudentService {
	

		static StudentDAO studentDAO=new StudentDAO();
		public void studentdetailService(Student student) {
			StudentService.studentDAO.addStudent(student);
		
		
		
	}
		
}
