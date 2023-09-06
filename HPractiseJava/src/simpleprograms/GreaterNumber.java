package simpleprograms;

public class GreaterNumber {

	public static void main(String args[])
	{
		int a=29;
		int b=27;
		int c=26;
		
		if(a>b)
		{
			if(a>c)
			{
           System.out.println(a);
		}
			else
			{
				System.out.println(c);
				}
			if(b>a)
			{
				if(b>c)
				{
					System.out.println(b);
				}
				else 
				{
					System.out.println(c);
				}
				if(c>a)
				{
					if(c>b) {
						System.out.println(c);
					}
					else {
						System.out.println(b);
					}
				}
			}
			}
		
	}
}