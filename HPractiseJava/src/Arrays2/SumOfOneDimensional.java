package Arrays2;

public class SumOfOneDimensional {
public static void main(String[]args) {
	int[] firstSet=new int[5];
	firstSet[0]=21;
	firstSet[1]=54;
	firstSet[2]=87;
	firstSet[3]=91;
	firstSet[4]=35;
	 

	int i=0;
	while (i<firstSet.length)
	{
		System.out.println(firstSet[i]);
		i++;
	}
	 int sum=0;
	 for (int afirstSet : firstSet) {
		 sum=sum+ afirstSet;
		 {
			 System.out.println("sum is"+sum);
		 }
		
	}
	 
	 }
}

