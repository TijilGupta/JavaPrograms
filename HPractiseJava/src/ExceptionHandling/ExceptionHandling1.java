package ExceptionHandling;

public class ExceptionHandling1 {
public static void main(String[]args)
{
	try {
		System.out.println(10/0);
		String str="tijil";
		System.out.println(str.charAt(4));
	}catch (ArithmeticException e) {
		// TODO: handle exception
	
	//checked exception comes in compile time
	
	
	System.out.println(e.toString());
		
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getLocalizedMessage());
		
	}
}
}
