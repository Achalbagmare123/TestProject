
public class ContinueDemo {

	public static void main(String[] args) {
		iloop:
		for (int i=0;i<5;i++) {
			jloop:
				for(int j=5;j>=i;j++) {
					if(j>i)
						break jloop;
					System.out.println(i);
				}
		}

	}

}
