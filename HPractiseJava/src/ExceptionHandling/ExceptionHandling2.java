package ExceptionHandling;

public class ExceptionHandling2 {
	public static void main(String[]args)
	{
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		//checked exception comes in compile time
		
		
		

		try {
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

		String str="tijil";
		System.out.println(str.charAt(4));
		
	}
	
}
