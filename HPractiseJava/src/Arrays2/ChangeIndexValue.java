package Arrays2;

import java.lang.reflect.Array;

import Loops.ForLoop;

public class ChangeIndexValue {
public static void main(String[]args) {
	
	int[] firstSet=new int[5];
	firstSet[0]=21;
	firstSet[1]=54;
	firstSet[2]=87;
	firstSet[3]=91;
	firstSet[4]=35;
	
	for (int num : firstSet) 
	{
		System.out.println(num);
	}
	System.out.println();
	{
	int[] testArray=firstSet;
	testArray[2]=31;
	

	for (int num1 : testArray) {
		System.out.println(num1);
		
	}
	}	
}
}