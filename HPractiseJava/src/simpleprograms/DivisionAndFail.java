package simpleprograms;

public class DivisionAndFail {
	public static void main(String args[])
	{
	int per=61;
	if(per>=60)
	{
		System.out.println("first division");
	}
	else if(per<60 && per>=50)
	{
		System.out.println("second division");
	}
	else if(per>=40 && per<50)
	{
		System.out.println("third division");
	}
	else
	{
		System.out.println("fail");
	}
}
}
