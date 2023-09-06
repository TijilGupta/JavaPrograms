package Collection;

import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vector<Integer> VecList=new Vector<Integer>();
         VecList.add(0,101);
         VecList.add(1,102);
         VecList.add(2,103);
         VecList.add(3,104);
         VecList.add(4,105);
         System.out.println(VecList);
         System.out.println(".......");
         Vector<Integer> VecList2=new Vector<Integer>();
         VecList2.add(0,106);
         VecList2.addAll(VecList);
         System.out.println(VecList2);
         System.out.println(".......");
         VecList.remove(3);
         System.out.println(VecList);
         System.out.println("..........");
         int VecLength=VecList.size();
         System.out.println("size of VecLength is:"+VecLength);
         System.out.println("..........");
         System.out.println("Using For Loop");
         for(int i=0; i<VecLength; i++) {
        	 System.out.println("The"+i+"th index"+"element of VecList is"+VecList.get(i));
         }
         for(int a:VecList)
         {
        	 System.out.println(a);
         }
	}
	

}
