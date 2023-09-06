package simpleprograms;

import java.util.Scanner;

public class Dynamic_cakculator {
	public static void main(String[]args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter values"); 
		String value =Scan.next();
		String array1[] = new String[value.length()];

		for (int i=value.length(); i>=value.length(); i--) {
			array1[i]=value.substring(i);
			System.out.println(array1[i-1]);

		}
		String temp ="";
		for (int i=0; i<array1.length; i++) {
			 Boolean flag=Character.isDigit(array1[i].indexOf(i));
			 if(flag) 
			 {
				 temp = array1[i];
			 }
		}
		 System.out.println(array1);
		 System.out.println(temp);


}}
