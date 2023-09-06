package Arrays2;

public class TwoDimensional1 {

	public static void main(String[] args) {
		
		int[][]firstSet={
				          {3,55,61,22},
				          {63,73,21,42},
				          {74,97,67,54},
		                  };

//System.out.println(firstSet.length);
		for (int r = 0; r < firstSet.length; r++) {
			for (int c = 0; c < firstSet[r].length; c++) {
			//	System.out.println(firstSet[r][c]);
				System.out.print(firstSet[r][c]+" ");	
			}
			System.out.println();
//			int sum=0;
//			for (int i = 0; i < firstSet.length; i++) {
//				for (int j = 0; j < firstSet[i].length; j++) {
//					sum=sum+firstSet[i][j];
			int sum=0;
			for (int[] afirstSet : firstSet) {
				for (int abfirstSet : afirstSet) {
					sum=sum+abfirstSet;
					
					{
						System.out.println("sum is"+sum);
					}
				}
			}
		}
	}
}
