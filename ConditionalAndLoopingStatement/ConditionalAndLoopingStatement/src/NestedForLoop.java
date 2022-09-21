
public class NestedForLoop {
		public static void main(String[] args) {
			for(int i=5;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					if(j==i)
						break;
					System.out.print(i);
					
				}
			
				System.out.println();
			}
			
			System.out.println("main method ends");
		}
		}


