package question3;

public class Main  {
	static int pgcount = 0;
	static int ugcount = 0;
	static int dcount = 0;
	public static void countObject(Degree...degreeObj) {
		for(Degree obj:degreeObj) {
			if(obj instanceof UnderGraduate) {
				ugcount++;
			}
			else {
				if(obj instanceof PostGraduate) {
					pgcount++;
				}
				else {
					if(obj instanceof Degree) {
						dcount++;
					}
				}
				System.out.println("The Undergraduate object are " +ugcount);
				System.out.println("The Postgraduate object are " +pgcount);
				System.out.println("The Degree object are " +dcount);		
			}
		}
	}
	public static void main(String[] args) {
		Degree degree=new Degree();
		UnderGraduate ug=new UnderGraduate();
		PostGraduate pg=new PostGraduate();
		UnderGraduate ug1=new UnderGraduate();
		PostGraduate pg1=new PostGraduate();
		countObject(degree,ug,pg,ug1,pg1);
		

	}

}
