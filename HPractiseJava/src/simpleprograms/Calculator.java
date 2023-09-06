package simpleprograms;

import java.util.Scanner;

public class Calculator {
public static void main(String[]args)
    {
     String yn;
     do {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the 1st no");
     int no1= sc.nextInt();
     System.out.println("enter the 2nd no");
     int no2=sc.nextInt();
     System.out.println("enter the symbol(+,-,*,/)");
     String sym=sc.next();
     int res;
     switch(sym) {
     case"+":res=no1+no2;
       System.out.println("Addition is:"+ res);
        break;
     case"-":res=no1-no2;
         System.out.println("subtraction is:"+ res);
         break;
     case"*":res=no1*no2;
    	 System.out.println("multiplication is:"+ res);
         break;
     case"/": res=no1/no2;
       System.out.println("divison is:"+ res);
       break;
         }
       System.out.println("do you want to continue(y to yes and n for no)");
       yn=sc.next();
     }
       while(yn.equals("y")||yn.equals("Y"));
}
}
