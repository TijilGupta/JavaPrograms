package ExceptionHandling;

import Functions.Function1;

public class CheckedException {
   
	public static void main(String[]args) throws InterruptedException {
		//we us throws to pass the information of checked exception to the next user//throws keyword we use in checked Exception)
		//
		Function1.sum();
		
		Thread.sleep(5000);
		
		Function1.sum();
		
		
		
	}
}
