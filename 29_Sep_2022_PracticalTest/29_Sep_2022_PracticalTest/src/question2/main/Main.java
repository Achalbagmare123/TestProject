package question2.main;

import question2.thread.ThankYou;
import question2.thread.Welcome;

public class Main {

	public static void main(String[] args) {
		Welcome welcome=new Welcome();
		welcome.start();
		ThankYou thankyou=new ThankYou();
		thankyou.start();
	}
}

	


