package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
	void readfile() throws FileNotFoundException
	{
		FileInputStream R=new FileInputStream("d:/hgvbhb/ghh");
	}
	void savefile() throws FileNotFoundException
	{
     	String text="I m here in read & write program";
		FileOutputStream w =new FileOutputStream("d:/ghjh/vhg");
	}
}
     class Test {
	public static void main(String[]args)
	{
		ReadAndWrite rw=new ReadAndWrite();
		try
		{
			rw.readfile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Hello");
	   
	try
	{
		rw.savefile();
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
     }
     }


