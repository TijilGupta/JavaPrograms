package simpleprograms;

import java.util.Scanner;

public class ScannerInput {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Gender");
		char Gender=s.next().charAt(0);
		System.out.println("age");
		int age=s.nextInt();
		System.out.println("Phone number");
		long Phonenumber=s.nextLong();
		
		System.out.println(".............");
		System.out.println("name:"+ name);
		System.out.println("Gender:"+ Gender);
		System.out.println("age:"+age);
		System.out.println("Phone number:"+ Phonenumber);
	}
	}
