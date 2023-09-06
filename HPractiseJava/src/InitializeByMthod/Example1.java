package InitializeByMthod;

import InitilizeObjectByRefrenceVariable.Animal;

public class Example1 {
	
		String colour;
		int age;
		void obj(String c,int a)
		{
			String color = c;
			int age=a;
		}
		
		void display()   // i have done some changes becoz program was executing abnormally.
		 {
		System.out.println(colour+""+age);
		 }
		public static void main(String[]args)
		{
			
		 Example1 buzo=new Example1();
				buzo.obj("black",8);
				buzo.display();
		
	}
	

}
