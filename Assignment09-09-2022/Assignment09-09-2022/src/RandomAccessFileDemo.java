import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
public class RandomAccessFileDemo {
public static void main(String[] args) {
	RandomAccessFile raf;
	try {
	raf=new RandomAccessFile("demo.txt","rw");
	raf.writeChars("Hello Everybody");
	raf.writeBytes("Hi Everybody");
	raf.close();
	}catch(IOException exception) {
		exception.printStackTrace();
	}
	try(RandomAccessFile raf1=new RandomAccessFile("demo.txt","rw");
			InputStreamReader in=new InputStreamReader(System.in)){
				String a;
				while((a=raf1.readLine())!=null) {
					System.out.println(a);
					
				}
				
	}catch(IOException exception) {
		exception.printStackTrace();
	}
   
}
}
