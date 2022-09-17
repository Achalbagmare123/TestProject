package question1.model;

public class Customer {
	private int id;
	private String name;
	private int age;

	public Customer() {
		
	}
    public Customer(int Custid,String Custname,int Custage ) {
    	id = Custid;
    	name = Custname;
    	age = Custage;	
    	
    }
	public int getCustId() {
		return id;
	}
	public void setCustId(int Custid) {
		id = Custid;
	}
	public String getName() {
		return name;
	}
	public void setCustName(String Custname) {
		name = Custname;
	}
	public int getCustAge() {
		return age;
	}
	public void setCustAge(int Custage) {
		age = Custage;
	}
}