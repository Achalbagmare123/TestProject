import java.util.Objects;

public class Student implements Comparable<Student> {
 int studentAge;
 String studentName;
public Student() {
	
}
public Student(int studentAge, String studentName) {
	super();
	this.studentAge = studentAge;
	this.studentName = studentName;
}
public int getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String toString() {
	return "Student (studentAge=" + studentAge + " and studentName=" + studentName + ")";
}
public int hashCode() {
	return Objects.hash(studentAge, studentName);
}
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return studentAge == other.studentAge && Objects.equals(studentName, other.studentName);
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
