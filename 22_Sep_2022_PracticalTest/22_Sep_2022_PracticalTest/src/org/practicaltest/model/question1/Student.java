package org.practicaltest.model.question1;

import java.util.Objects;

public class Student implements Comparable<Student> {
	 int studentId;
	 String studentName;
	 int studentAge;
	public Student() {
		
	}
	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
	
	
	public int hashCode() {
		return Objects.hash(studentAge, studentId, studentName);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentAge == other.studentAge && studentId == other.studentId
				&& Objects.equals(studentName, other.studentName);
	}
	public int compareTo(Student studentobj) {
		int val=0;
		if(this.studentAge==studentobj.studentAge)
			val=0;
		else
			val=this.studentAge>studentobj.studentAge?1:-1;
		return val;
	}

	 
	}