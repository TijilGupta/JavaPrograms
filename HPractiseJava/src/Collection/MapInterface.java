package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
public static void main(String[]args){
	
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "Hazel");
	map.put(2, "Ankita");
	map.put(3, "Komal");
	System.out.println(map.get(2));

}
}
