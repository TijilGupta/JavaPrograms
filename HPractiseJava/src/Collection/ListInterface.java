package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {
	public static void main(String[]args) {
		//Object[] arr=new Object[3];
		//arr[0]="tijil";
		////arr[1]=true;
		//arr[2]=31;
		List<String> list=new ArrayList<>();
		
		list.add("tijil");
		list.add("hazel");
		list.add("komal");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
         list=new LinkedList<>();
		
		list.add("tijil");
		list.add("hazel");
		list.add("komal");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
        list= new Vector<>();
		
		list.add("tijil");
		list.add("hazel");
		list.add("komal");
		
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
