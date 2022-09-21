import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public String toString() {
		return"Demo";
	}

	public static void main(String[] args) {
		HashSet hashset=new HashSet();
		Set set=new HashSet();
		String s=new String("Hello");
		Integer i=new Integer(1);
		SetDemo sd=new SetDemo();
		hashset.add(set);
		hashset.add(s);
		hashset.add(i);
		hashset.add(sd);
		
		System.out.println(hashset);

		

	}

}
