package NonStaticFunction;

public class NonStaticFunction1 {
	public static void main(String[]args) {
		
		 NonStaticFunction1 ref=new  NonStaticFunction1 ();
		 int sum=ref.sum(10,20);
		System.out.println(sum);
	}
     public int sum(int a,int b)
     {
    	 return a+b;
     }
}
