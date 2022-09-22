import java.io.File;
public class FileDemo {

	public static void main(String[] args) {
		File f=new File("demo.txt");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canRead());
		System.out.println(f.isAbsolute());
		System.out.println(f.getName());
		System.out.println(f.length());
		System.out.println(f.getFreeSpace());




	}

}
