package org.practicaltest.view;
import java.util.Scanner;
import org.practicaltest.model.QuestionAnswer;
public class Main {
		static Scanner scanner=new Scanner(System.in);

		public static void displayQuestion (QuestionAnswer [] q) { 
			for (int i=0;i<q.length;i++) {
				if(q[i]!=null) {
					System.out.println("Question:"+q[i].getQuestion());
					System.out.println("1."+q[i].getOption1());
					System.out.println("2."+q[i].getOption2());
					System.out.println("3."+q[i].getOption3());
					System.out.println("4."+q[i].getOption4());
					System.out.println("Enter your Answer");
					String answer=scanner.nextLine();
					if(q[i].getAnswer().equals(answer)) {
						System.out.println("correct");
					}
					else{
						System.out.println("wrong");
					}
					System.out.println();
				}else {

						break;	
				}
			}
		}
		public static void main(String[] args) {
		 QuestionAnswer[] array=new QuestionAnswer[5];
		 QuestionAnswer q1=new QuestionAnswer("find out correct word","cat","cet","cte","cta","cat");
		 QuestionAnswer q2=new QuestionAnswer("find out correct word","kite","kete","ktei","kita","kite");
		 QuestionAnswer q3=new QuestionAnswer("find out correct word","hote","hot","heto","htoe","hot");
		 QuestionAnswer q4=new QuestionAnswer("find out correct words","pina","pain","pnai","pnia","pain");
		 QuestionAnswer q5=new QuestionAnswer("find out correct words","clean","clane","clene","clena","clean"); 
		 array[0]=q1;
		 array[1]=q2;
		 array[2]=q3;
		 array[3]=q4;
		 array[4]=q5;
		 
		 displayQuestion(array);
		}
}
		