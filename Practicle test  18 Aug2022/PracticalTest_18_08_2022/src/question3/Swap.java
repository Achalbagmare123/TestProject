package question3;

public class Swap {
	public static void main(String[] args) {
		int a = 90;
		int b = 50;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping ="+"a="+a+", b ="+b);
	}

}
