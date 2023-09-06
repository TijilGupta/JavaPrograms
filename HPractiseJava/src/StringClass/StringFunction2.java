package StringClass;

public class StringFunction2 {
	public static void main(String[]args) {
       String s="I am Tijil Gupta writing String Program";
       int lngth=s.length();
       System.out.println(lngth);
       
       System.out.println("..........");
       
       char a=s.charAt(5);
       System.out.println(a);
       
       System.out.println(".........");
       
       String Ss=s.substring(7);
       System.out.println(Ss);
       
       System.out.println(".......");
       
       String Sss=s.substring(6,10);
       System.out.println(Sss);
       
       System.out.println("......");
       
       String s1="Tijil Gupta";
       String s2="Tijil";
       System.out.println(s1.equalsIgnoreCase(s2));
       
       System.out.println("......");
       
       System.out.println(s1.contains(s2));
       
       System.out.println("..........");
        
       
       System.out.println(s.indexOf('a'));
       
       System.out.println(s.indexOf('a',16));
       
       System.out.println(".........");
       
       System.out.println(s.lastIndexOf('a',17));
       
       System.out.println("..........");
       
       System.out.println(s1.concat(s2));
       
       System.out.println(s1.replace("Tijil" ,"Tej"));
       
       
       System.out.println("..........");
       System.out.println(s.toUpperCase());
       System.out.println(s.toLowerCase());
       
       System.out.println(".........");
       
       String[] splt=s2.split("");
       for(String A:splt){
       {
    	   System.out.println(A);
       }
       }
       }

}
