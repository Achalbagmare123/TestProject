import java.util.Scanner;

public class ExceptionDemo {
	  static void display() {
		  try {
		  int d=8/0;
	  }catch(NullPointerException exceptionNPE) {
		  System.out.println("Enter c=");

	  }
	  }
	  public static void main(String[] args) {

	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter A=");
	  System.out.println("Enter B=");
	  display();
	
		  System.out.println("Division by zero is not possible");
	  }
}

