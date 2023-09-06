package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlock {
	public static void main(String[]args) throws IOException
	{
		FileInputStream s=null;
		try {
		s=new FileInputStream("d:/xtynj/xsh/");
	    
		System.out.println(s);
		}
		catch(FileNotFoundException e){
			System.out.println("file not found");
		}
		
		finally {      // clean up code
			if(s !=null)
			{
				s.close();
			}
			
			System.out.println("File closed");
		      }
	        }
		}



