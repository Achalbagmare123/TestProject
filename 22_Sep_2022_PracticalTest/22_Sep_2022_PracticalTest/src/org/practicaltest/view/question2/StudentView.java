package org.practicaltest.view.question2;

import java.util.Scanner;

import org.practicaltest.model.question1.Student;
import org.practicaltest.service.question3.StudentService;



public class StudentView {
	 
		 static StudentService service=new StudentService();
		 public void addStudent() {
			 Scanner scanner=new Scanner(System.in);
		System.out.println("Student Information -");
		System.out.println("Enter a Student Id :");
		int studentId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter a Student Name :");
		String studentName=scanner.nextLine();
		System.out.println("Enter a Student Age :");
		int studentAge=scanner.nextInt();
		scanner.nextLine();
		
		Student studentobj=new Student(studentId,studentName,studentAge );
		
			StudentView.service.studentdetailService(studentobj);
		 }	
}