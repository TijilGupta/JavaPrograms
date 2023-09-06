package simpleprograms;

import java.util.Scanner;

public class VowelsAndConsonants {
public static void main(String[]args)
 {
	
 Scanner sc=new Scanner(System.in);
  System.out.println("enter the string");
  String s=sc.nextLine();
  int i,vowels,cons;
  vowels=cons=0;
  s=s.toLowerCase();
  for( i=0; i<s.length(); i++) {
		char ch=s.charAt(i);
	  if(ch!=' ' && ch!= '.')
	  {
		  if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
		  vowels++;
		  else
			  cons++;
	    }
      }
         System.out.println("total vowels is"+vowels+"total consonants is"+cons);
  }

 }



