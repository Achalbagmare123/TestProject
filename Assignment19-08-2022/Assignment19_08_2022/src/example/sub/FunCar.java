package example.sub;

import example.base.Car;

public class FunCar extends Car{
	public FunCar(){
		Car car = new Car();
        car.Car();
	}
	
	FunCar(String color,String body){
		Car car = new Car();
		car.color="blue";
		car.body="wagon";
		car.Car();
		car.playRadio();

	}
	public void playCD() {
		
		System.out.println("Beautiful music is played");
		return;

	}
		
		
		


		
		
		// TODO Auto-generated constructor stub
	

}
