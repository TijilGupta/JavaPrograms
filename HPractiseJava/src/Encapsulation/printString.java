package Encapsulation;

import java.util.Scanner;

public class printString {
public static void main(String[]args)
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first no:");
	a=sc.nextInt();
	System.out.println("Enter the second no:");
	b=sc.nextInt();
	int c=a+b;
	System.out.println("The sum of:"+a+" and "+b+ "is" +c);
	}
}
