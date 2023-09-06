package Constructor;

public class Car {
	public static int wheel;
	String colour;
	String model;
	int wheels=4;
	
	public void features()
	{
		System.out.println("congratulations for your new"+wheels+" wheeler "+colour+" coloured"+ model);
	}


public Car() {}
public Car(String colour,String model,int wheels) {
 this.colour=colour;
 this.model=model;
}
}