package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorInterface {
public static void main(String[]args) {
	Set<String> set=new HashSet<>();
	
	set.add("Hazel");
	set.add("Ankita");
	set.add("Komal");
	set.add("Hazel");
	set.add("Ankita");
	set.add("Komal");
	
	Iterator<String> it=set.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}
}
