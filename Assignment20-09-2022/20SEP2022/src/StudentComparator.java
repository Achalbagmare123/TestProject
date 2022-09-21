import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	public int compare(Student student1, Student student2) {
		String s1=student1.getStudentName();
		String s2=student2.getStudentName();
		return s1.compareTo(s2);

		//return student1.getStudentName().compareTo(student2.getStudentName());
	}
	}


