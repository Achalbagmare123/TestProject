import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmapobj1=new HashMap<>(); //hashmap interface
		hashmapobj1.put(5,"JAVA");
		hashmapobj1.put(2,"C++");
		hashmapobj1.put(3,"HIBERNATE");
		System.out.println(hashmapobj1);
		
		HashMap<Integer,String> hashmapobj=new HashMap<>(); //hashmap interface
		hashmapobj.put(5,"AAA");
		hashmapobj.put(4,"BBB");
		hashmapobj.put(1,"CCC");
		System.out.println(hashmapobj);
		hashmapobj.put(2,"ddd");
		System.out.println(hashmapobj);
		System.out.println(hashmapobj.toString());

		
		Set<Integer>keys=hashmapobj.keySet();
		Iterator<Integer> iteratorobj=keys.iterator();
		while(iteratorobj.hasNext()) {
			Integer k=iteratorobj.next();
			System.out.println(k +" : "+hashmapobj.get(k));

		}
	
		
		TreeMap<Integer,String> treemapobj=new TreeMap<Integer,String>(); //TREEMAP INTERFACE
		treemapobj.put(2,"EEE");
		treemapobj.put(3,"BBB");
		treemapobj.put(1,"AAA");
		System.out.println(treemapobj);
		treemapobj.put(4,"ddd");
		System.out.println(treemapobj);
	}

}
