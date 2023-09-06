package simpleprograms;

import java.util.Scanner;

public class YoungerAgeException extends RuntimeException {
	public YoungerAgeException(String msg)
	{
		super(msg);
	}
	}
class Voting
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter ur age");
		int age=scn.nextInt();
		try
		{
	if(age<18)
		{
		throw new YoungerAgeException("u r not eligible");
		}
	else
	{
		System.out.println("u r eligible");
	}	
		}
		catch(YoungerAgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}

