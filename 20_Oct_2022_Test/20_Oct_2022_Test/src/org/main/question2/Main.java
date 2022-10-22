package org.main.question2;

import java.util.Scanner;

import org.model.question2.MovieTheatre;
import org.view.question2.MovieTheaterView;




public class Main {

	
static Scanner scanner=new Scanner(System.in);
		
		static void displaySubMenu() {
			System.out.println("1. Movie Information -");
			
			int subMenuChoice=scanner.nextInt();
			scanner.nextLine();
			switch(subMenuChoice) {
			case 1:
				if(MovieTheaterView.addMovie())
					System.out.println("Movie information added Sucessfully");
				break;
			
				
			case 2:
				MovieTheatre movietheatre[]=MovieTheaterView.displayMovie();
				for(MovieTheatre localMovieTheatre:movietheatre) {
					if(localMovieTheatre!=null)
					System.out.println(localMovieTheatre);
					else
						break;
				}
				
				

				break;
				default: 
					System.out.println("Not a valid input");
			}	
		
	}	
		public static void main(String[] args) {
			
			int choice;
			do {
				System.out.println("Movie Application");
				System.out.println("1. Start Application");
				System.out.println("2. Stop Application");
				System.out.println("Enter your choice");
				choice=scanner.nextInt();
				scanner.nextLine();
				switch(choice) {
				case 1:
					displaySubMenu();
				
					break;
				case 2:
					System.exit(0);
					
					break;
					default:
						System.out.println("Not a valid input");
				}
			}while(true);
	
		}
}


