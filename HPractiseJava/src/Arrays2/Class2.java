package Arrays2;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] secondSet=new int[5];
		secondSet[0]=41;
		secondSet[1]=91;
		secondSet[2]=35;
		secondSet[3]=20;
		secondSet[4]=16;
	
for (int i = 0; i < secondSet.length; i++) {
	System.out.println(secondSet[i]);
}
int sum=0;
for (int i = 0; i < secondSet.length; i++) {
	sum=sum+secondSet[i];
	{
		System.out.println("sum is"+sum);
	}
	
}
	 }
	}
//		int i=0;
//		for (int i1 = 0; i1 < secondSet.length; i1++) {
//			System.out.println(secondSet[i1]);	
//		}
//		int sum=0;
//		for (int j : secondSet) {
//			sum=sum+j;
//			{
//				System.out.println("sum is "+sum);
//			}
//			
//		}