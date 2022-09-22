package org.practicaltest.dao.question3;

import org.practicaltest.model.question1.Student;


public class StudentDAO {
	static Student studentArray[]=new Student[10];
	public static boolean addStudent(Student student) {
		boolean result=false;
		
		for(int i=0;i<10;i++)
		{
			if(studentArray[i]==null) {
				studentArray[i]=student;
				result=true;
				break;
			}
		}
		
		return result;
	}

}


	