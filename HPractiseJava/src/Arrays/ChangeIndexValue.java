package Arrays;

public class ChangeIndexValue {
public static void main(String[]args) {
	int[]secondSet=new int[6];
	secondSet[0]=12;
	secondSet[1]=33;
	secondSet[2]=23;
	secondSet[3]=56;
    secondSet[4]=42;
    secondSet[5]=31;
	  
    int[] testArray=secondSet;
    testArray[2]=74;
    for ( int num : secondSet) {
    	 System.out.println(num );	
	}			
}
}
