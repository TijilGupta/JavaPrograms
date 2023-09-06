package Collection;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> arryList=new ArrayList<String>();
		 arryList.add(0,"Java");
		 arryList.add(1,"Selenium");
		 arryList.add(2,"Java");
		 arryList.add(3,"Python");
		 arryList.add(4,"Ruby");
		 System.out.println(arryList);
		 
		 ArrayList<String> arryList2=new ArrayList<String>();
		 arryList2.add(0,"Techbodhi");
		 arryList2.addAll(arryList);
		 System.out.println(arryList2);
	   System.out.println(".................");
	   arryList.remove(4);
	   System.out.println(arryList);
	   System.out.println("...............");
	   System.out.println("Element of 0th index is :"+arryList.get(0));
	   System.out.println("...............");
	   
	   int arryLength=arryList.size();
	   System.out.println("The size of arryList is:"+arryLength);
	   System.out.println("................");
	   System.out.println("Simple for Loop");
	   for(int i=0; i<arryLength; i++)
	   {
		   System.out.println("The"+i+"elemnets of arryList is"+arryList.get(i));
		   System.out.println("..................");
		   System.out.println("Using for ForEachloop");
		   for(String A1:arryList) {
			   System.out.println(A1);
		   }
	   }
	}
}
