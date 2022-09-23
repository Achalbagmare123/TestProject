
public class FullTimeEmployee extends Employee {
	int id;
	FullTimeEmployee(int id){
		super(56);//Employee constructor
		System.out.println("FullTimeEmployee");
		System.out.println(super.id);
		System.out.println(this.id);
		System.out.println(id);
	}

}
