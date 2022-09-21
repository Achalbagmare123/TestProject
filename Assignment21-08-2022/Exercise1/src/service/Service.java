package service;

public class Service {
	public boolean checkNumber(int number) {
		while(number%2==0) {
			number=number/2;
		}
		boolean result = false;
		if(number==1) {
			result=true;
			System.out.println("given number is a power of 2");
		}
		else {
			System.out.println("given number is not a power of 2");

		}
		return result;
		
	}

}
