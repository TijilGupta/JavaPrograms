package Arrays2;

public class TwoDimensional2 {

	public static void main(String[] args) {
	
		int[][] secondSet= {
				{63,45,67,89},
				{45,65,32,21},
				{87,97,89,60},
		};
	//	for (int i = 0; i < secondSet.length; i++) {
		//	for (int j = 0; j < secondSet[i].length; j++) {
		//		System.out.print(secondSet[i][j]+" ");}}
		for (int[] asecondSet : secondSet) {
			for (int aAsecondSet : asecondSet) {
				System.out.print(aAsecondSet+" ");
			}
			System.out.println();
		}
		int sum=0;
		for (int[] asecondSet : secondSet) {
			for (int aAsecondSet : asecondSet) {
				sum=sum+aAsecondSet;
				
				System.out.println("sum is"+sum);
			}
			
		}
	}
}