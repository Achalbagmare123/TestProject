
public class Employee {
	 int id;

	
	Employee(int id){
		this("Achal");
		this.id=id;
	}
	Employee(String name){
		System.out.println("Employee:String");
	}
		void display(int id) {
		System.out.println(id);
		System.out.println(this.id);
	}

}
