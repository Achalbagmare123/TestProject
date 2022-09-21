import java.util.Iterator;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		TreeSet<Student> treesetobj=new TreeSet<Student>();
		treesetobj.add(new Student(25,"Ajay"));
		treesetobj.add(new Student(45,"Ram"));
		treesetobj.add(new Student(34,"Sandy"));
		System.out.println(treesetobj);
		
		Iterator<Student> iteratorobj=treesetobj.iterator();
		while(iteratorobj.hasNext()) {
			System.out.println(iteratorobj.next());

		}

	}

}
