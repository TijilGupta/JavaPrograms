package ExceptionHandling;

import java.util.Scanner;
  class NotGood extends Exception{
	  NotGood(String msg)
	  {
		  super(msg);
	  }
  }
  public class HPLap {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price");
		int price=sc.nextInt();
		try {
			if(price<20000)
			{
				throw new Exception("I dont want to purchase");
			}
			else
			{
				System.out.println("i want to purchase");
			}
		}
		  catch(Exception e)
		{
			  e.printStackTrace();
		}
	}

}
