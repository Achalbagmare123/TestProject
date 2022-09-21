
public class SumOfNumbers {
	public int calculateSum(int n) {
		int sa = ((n/3)*(2*3+(n/3-1)*3))/2;
		int sb = ((n/5)*(2*5+(n/5-1)*5))/2;
		int sc = ((n/15)*(2*15+(n/15-1)*15))/2;
		int sum = sa+sb-sc;
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumbers Obj = new SumOfNumbers();
		int sum = Obj.calculateSum(35);
		System.out.println("Sum of n natural number is =" +sum);
		
		// TODO Auto-generated method stub

	}

}
