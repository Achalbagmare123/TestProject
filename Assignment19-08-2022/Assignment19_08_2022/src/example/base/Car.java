package example.base;

public class Car {
     public String color;
	 public String body;
	
	public void Car() {
		color="blue";
		body="wagon"; 
		
	}
	protected void Car(String carcolor,String carbody ) {
		color="carcolor";
		body="carbody";
	}
	public void playRadio() {
		System.out.println("Radio is played");
		return;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}

