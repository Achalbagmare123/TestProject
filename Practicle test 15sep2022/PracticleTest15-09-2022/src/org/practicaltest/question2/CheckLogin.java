package org.practicaltest.question2;

import java.util.Scanner;

class UsernameException extends Exception {
	 
	 public UsernameException(String msg) {
	  super(msg);
	 }
	}

class PasswordFormatException extends Exception {
 
 public PasswordFormatException(String msg) {
  super(msg);
 }
}

public class CheckLogin {

 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  String username;
  String password;
  
  System.out.print("Enter username :: ");
  username = s.nextLine();
  
  System.out.print("Enter password :: ");
  password = s.nextLine();
  
  int length = password.length();
  
  try {
   if(!username.equals("hello"))
    throw new UsernameException("Incorrect username\nType correct username ???");
   else if((length > 6))
    throw new PasswordFormatException("password must be less than 6 characters ???");
   else
    System.out.println("Login Successful !!!");
  }
  catch (UsernameException u) {
   u.printStackTrace();
  }
  catch (PasswordFormatException p) {
   p.printStackTrace();
  }
  finally {
   System.out.println("The finally statement is executed");
  }
 }
}
