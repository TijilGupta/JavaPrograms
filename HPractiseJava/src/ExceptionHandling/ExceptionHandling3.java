package ExceptionHandling;

public class ExceptionHandling3 {

	public static void main(String[]args) {
		try {
			System.out.println(10/0);
			Thread.sleep(3000);
			
			String str="tijil";
			System.out.println(str.charAt(8));
			
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("hello");
	}
}
