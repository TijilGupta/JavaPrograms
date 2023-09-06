package ExceptionHandling;

import Constructor.Car;//by default value null//int 0 //string null

public class ExceptionType1 {
public static Car car;
	public static void main(String[] args) {
		
		System.out.println(10/2);
		
		//Exception1:ArithmeticException
		//System.out.println(10/0);    //(if any exception come then it should be resolved
		
		//Exception2:StringIndexOutOfBoundsException
         String name="Tijil";
        // System.out.println(name.charAt(5));
         
        // Exception3:
         car.features();//it wont exist becoz we didnt make object//NullPointerException-:when we not intialize object
	
	//checked exception:exception checked by compiler
	//unchecked exception
	}

}
