package OopsByDeepak;

public class Animal3 {
String color;
int age;
void initObj(String c,int a)
{
	color=c;
	age=a;
}
void display()
{
	System.out.println(color+" "+age); 
	}
public static void main(String[]args)
{
	Animal3 buzo=new Animal3();
	buzo.initObj("black",10);
	buzo.display();
	Animal3 buzo1=new Animal3();
	buzo1.initObj("brown", 12);
	buzo1.display();
	}
}