package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlng1 {
	public static void main(String[]args)
	{
		try {
		FileInputStream s=new FileInputStream("d:/xyz/uohhh/");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
			System.out.println("Hello");
		}
		try {
		String name=null;
		System.out.println(name.length());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);
		}
	
	}

}
