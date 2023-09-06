package StringClass;

public class StringFunction {
	public static void main(String[] args) {
		String name = "Tijil";
		// Function 1
		System.out.println(name.length());

		// Function 2
		System.out.println(name.charAt(3));

		// Function 3
		String name2 = "TIjil";
		System.out.println(name.equals(name2));

		// Function 4
		System.out.println(name.equalsIgnoreCase(name2));

		// Function 5
		String temp = "Tijil Gupta";
		String[] arr = temp.split(" ");
		for (String s : arr) 
			System.out.println(s);
		
		
		//Function 6
		System.out.println(temp.substring(3));
		System.out.println(temp.substring(2, 4));
	
	
	//Function 7
	
		System.out.println(temp.replace(" "," "));
	
	
	//Function 8
	String temp2="Tijil";
	System.out.println(temp2);
	System.out.println(temp2.trim());
	
	
	//Function 9
	String temp3="TiJiL";
	System.out.println(temp3.toLowerCase());
	
	//Function 10
	System.out.println(temp3.toUpperCase());
	
	//Function 11
	String temp4="Tijil";
	
}
}

