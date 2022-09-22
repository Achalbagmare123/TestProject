package org.practicaltest.main;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

import org.practicaltest.model.question1.Student;
import org.practicaltest.view.question2.StudentView;


public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentView sv=new StudentView();
		sv.addStudent();
		
		TreeSet<Student> t=new TreeSet<>();
		
		Student s1 = new Student(1, "AAA", 23);
		Student s2 = new Student(2, "DDD", 45);
		Student s3= new Student(3, "SSS", 29);
		Student s4= new Student(4, "YYY", 34);
		Student s5= new Student(5, "TTT", 20);
		Student s6= new Student(6, "JJJ", 78);
		Student s7= new Student(7, "PPP", 12);
		Student s8= new Student(8, "KKK", 35);
		Student s9= new Student(9, "UUU", 22);
		Student s10= new Student(10, "EEE", 21);
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		t.add(s6);
		t.add(s7);
		t.add(s8);
		t.add(s9);
		t.add(s10);
		
		System.out.println("Ten Students Details : ");	
		System.out.println("Student Id   Student Name   Student Age");	

		for(Student s: t) {
			System.out.println(s.getStudentId() + "                 " + s.getStudentName()+ "          "+ " " + s.getStudentAge());

			
		}
		
		
		
		
	
	}
}