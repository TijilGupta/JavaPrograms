package Loops;

import Functions.AccessModifiers;//when u have two accessmodifiers in different packages

public class TestAccessModProjectLevel extends AccessModifiers{
	public static void main(String[]args) {

    AccessModifiers obj=new AccessModifiers();
    obj.publicFunction();
	 
    
    TestAccessModProjectLevel obj2=new TestAccessModProjectLevel();
    		obj2.protectedFunction();
	}
}

