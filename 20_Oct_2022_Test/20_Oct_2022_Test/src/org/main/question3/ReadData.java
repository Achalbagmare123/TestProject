package org.main.question3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
     public static void main(String[] args) throws IOException {
 	    String textFile;
 	   FileReader fr=new FileReader("C:/Users/yasht/OneDrive/Documents/TEXTFILE.txt");
 		 BufferedReader bufferreader=new BufferedReader(fr);
			 
		while((textFile = bufferreader.readLine())!=null){
	    System.out.println(textFile);
	 }
		bufferreader.close();
       }

}


