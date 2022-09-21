import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
public class SettingDemo {

	public static void main(String[] args) {
		//create an student array and assign student object 
		//***** Array Sort *****//
		Student studentarray[]= {new Student(46,"AAA"),new Student(23,"BBB")};
		Arrays.sort(studentarray);
		for(Student s:studentarray ){
			System.out.println(s);
			String str[]= {"DDD","NNNN","YYYY","TTTT"};
			Arrays.sort(str);
			for(String s1:str)
				System.out.println(s1);
		}
				
			//***** Collection Sort *****//	
			LinkedList<Student> linkedlistobj=new LinkedList<Student>();
			linkedlistobj.add(new Student(34,"Ram"));
			linkedlistobj.add(new Student(4,"Vijay"));
			linkedlistobj.add(new Student(23,"Payal"));
			
			
				Collections.sort(linkedlistobj);
				System.out.println(linkedlistobj);
				StudentComparator scobj = new StudentComparator();
				Collections.sort(linkedlistobj,scobj);
				System.out.println(linkedlistobj);


		
		

	}

	}

