package oops.inheritance;

public class User {
public static void main(String[]args) {
	Telephone phone=new Telephone();
	phone.calling();
	//System.out.println("User");
	//user cant access multiple inheritance,it can access only one class
	
	SmartPhone sw=new SmartPhone();
	sw.calling();
	
}
}
