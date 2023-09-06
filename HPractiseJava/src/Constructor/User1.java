package Constructor;

public class User1 {

public static void main(String[]args)
{
	Car ford=new Car();
	ford.colour="White";
	ford.model="Figo";
	//ford.wheels=5;
	ford.features();
	
	
	
	Car VW=new Car();
	ford.colour="Black";
	ford.model="Polo";
	ford.wheels=6;
	ford.features();
	
	Car Maruti=new Car();
	ford.colour="silver";
	ford.model="ciaz";
	//ford.wheels=4;
	ford.features();
	
	Car bmw=new Car("White","x320",5);
	Car.wheel=5;
	bmw.features();
	
	
}
	}