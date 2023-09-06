package simpleprograms;

public class CapitalSmallStringEqual {
	public static void main(String args[])
	{
	String a="TIJIL";
	String b="tijil";
	
	System.out.println(a);
	System.out.println(b);
	if(a.toUpperCase().equals(b))
	{
		System.out.println("string are equal");
	}
	else
	{
		System.out.println("string are not  equal");
	}
	}
}
