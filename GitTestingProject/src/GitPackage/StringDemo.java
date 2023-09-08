package GitPackage;

public class StringDemo {

	public static void main(String[] args) {
		String s= "I am Tijil Gupta Demo class";
		System.out.println(s.length());
		 
		char charatt=s.charAt(5);
		System.out.println(charatt);
		
		String full=s.substring(11);
		System.out.println(full);
		String FullSub=s.substring(10, 18);
		System.out.println(FullSub);
		
		String s1="Tijil Gupta";
		String s2="Tijil";
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.contains(s2));
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a')); //Its begin from the last
		System.out.println(s.lastIndexOf('G',17));  // Its Begin from the last
		System.out.println("Index of Method:"+s.indexOf("Gup"));
		
		System.out.println("..........");
		
		
		System.out.println("Replace:"+s.replace("Tijil","Tej"));
		
		System.out.println("UpperCase"+s.toUpperCase());
		System.out.println("LowerCase"+s.toLowerCase());
		
		System.out.println("........");
		
		String[] splt=s.split(" ");
		for(String a: splt)
		{
			System.out.println("Each value of Splitted String:"+a);
		}
		// commiting from GitRemote
		//commit from Eclipse but push from Bash
		//adding cod efrom GitHub Desktop
		
	}

}
