package ExceptionHandling;

public class ExceptionHandling4 {
	public static void main(String[]args) {
		try {
			System.out.println(10/2);
			Thread.sleep(3000);
			
			String str="tijil";
			System.out.println(str.charAt(3));
			//car.features();
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Executing finally block");
		}
	}
}
