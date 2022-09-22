import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class DateDemo {
	public static void main(String[] args) {
		//String date="2022-08-16";
		//LocalDate localdate=LocalDate.parse(date);
		//System.out.println(localdate);
		
		LocalDate localdate1=LocalDate.now();
		System.out.println(localdate1);
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the return date");
        String returnDateString=scanner.nextLine();
        LocalDate localdate3=LocalDate.parse(returnDateString);//YYYY-MM-DD       
		System.out.println(localdate3);
		System.out.println("calculate no of days");
		long noOfDays=ChronoUnit.DAYS.between(LocalDate.now(), localdate3);
		System.out.println(noOfDays);


		

		
		


		
		
		
		
	}
	

}
