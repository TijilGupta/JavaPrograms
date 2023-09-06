package Collection;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> LinkList= new LinkedList<String>();
        LinkList.add(0,"Tijil");
        LinkList.add(1,"Bhupesh");
        LinkList.add(2,"Gaurav");
        LinkList.add(3,"Rahul");
        LinkList.add(4,"Devesh");
        System.out.println(LinkList);
        LinkedList<String> LinkList2=new LinkedList<String>();
        LinkList2.add(0,"Akshay");
        LinkList2.addAll(LinkList);
        System.out.println(LinkList2);
        System.out.println("............");
        LinkList.remove(3);
        System.out.println(LinkList);
        System.out.println(".......");
        System.out.println("Element of 0th index is"+LinkList.get(0));
        System.out.println("........");
        int LinkLength=LinkList.size();
        System.out.println("Size of LinkList is:"+LinkLength);
        System.out.println("............");
        System.out.println("Using For Loop");
        for(int i=0; i<LinkLength; i++)
        {
        	System.out.println("The"+i+"Elements of LinkList is:"+LinkList.get(i));
        	System.out.println("...........");
        	
        	for(String A1:LinkList)
        	{
        		System.out.println(A1);
        	}
        }
	}

}
