package simpleprograms;

public class DivisionPercentage {
	
	public static void main(String []args)
	{
		int per=45;
		if (per>=60)
		{
		System.out.println("first division");
		}
		else if(per<60 && per>=50)
		{
			System.out.println("2nd division");
		}
		else if(per<50 && per>=40)
		{
			System.out.println("3rd division");
		}
		else if (per<40)
		{
			System.out.println("Fail");
		}
	}

}
