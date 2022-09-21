
public class Difference {
	public int calculateDifference(int n) {
		int a = ((n*(n+1)*(2*n+1))/6) ;
		int b = (n*(n+1)/2);
		int m = b*b;
		int sum = m - a;
		return sum;	
	}

	public static void main(String[] args) {
		Difference Obj = new Difference();
		int sum = Obj.calculateDifference(3);
        System.out.println("Difference is =" +sum);
 }

}
