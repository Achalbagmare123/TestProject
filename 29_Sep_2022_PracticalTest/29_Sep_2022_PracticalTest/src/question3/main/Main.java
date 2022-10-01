package question3.main;

public class Main implements Runnable {
	public void run() {
		
	}
	
public static void main(String[] args){
    Runnable myThread = () ->{
        Thread.currentThread().setName("Welcome to");
        System.out.println(Thread.currentThread().getName()+ "Lambda expression thread");
    };
    Thread t = new Thread(myThread);
    t.start();
}
}