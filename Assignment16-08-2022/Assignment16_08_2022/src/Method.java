
public class Method {
	void start() {
		System.out.println("Start method called");
	}
	void displayInstruction() {
		System.out.println("displayInstruction method called");

	}
	void exit() {
		System.out.println("exit method called");	
	}

	public static void main(String[] args) {
		int menuInput = 5;
		Method Obj = new Method();
		switch(menuInput) {
		case 1: Obj.start();
		
		break;
		case 2: Obj.displayInstruction();
		
		break;
		case 3: Obj.exit();
		
		break;    
		default:System.out.println("method is not available");
		

		

	} 
        

		
		
		// TODO Auto-generated method stub

	}

}
