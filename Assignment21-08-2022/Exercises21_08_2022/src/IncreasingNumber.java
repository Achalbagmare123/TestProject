
public class IncreasingNumber {
	public boolean checkNumber(int n) {	
		while(n>0) {
			n = n / 10;

			n = n % 10;


		}
		boolean result = false;
		if(n<=n%10) {
			n = n / 10;
			n = n % 10;

		
			result = true;
		
		}
		return result;
	}
	

	public static void main(String[] args) {
		IncreasingNumber Obj = new IncreasingNumber();
		boolean value = Obj.checkNumber(1234);
		if(value) {
			System.out.println(value);
			System.out.println("numbers are in increasing order");
			
			
		}
		else {
			System.out.println(value);
			System.out.println("numbers are not in increasing order");
			
			
		}
	

	}

}
