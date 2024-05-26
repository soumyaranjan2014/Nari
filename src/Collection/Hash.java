package Collection;
import java.util.*;
import java.util.Map.Entry;
public class Hash {
	
	public static void main(String[] args) {
		
	HashMap<String,Integer>r=new HashMap<>();
	
	//country and population
	r.put("India", 120);
	r.put("china", 125);
	r.put("us",30);
	System.out.println(r);
	r.put("china",180);
	System.out.println(r);
	r.put("indo", 99);
	System.out.println(r);
	
	//search
	System.out.println(r.containsKey("indo"));
	//get
//	System.out.println(r.get("china"));
//	System.out.println(r.get("Odisha"));
	
	//iterator
	
		for(Entry<String, Integer> O:r.entrySet())
		{
			System.out.println(O.getKey());;;;;;
			System.out.println(O.getValue());
		}
		
		//remove
		r.remove("china");
		System.out.println(r);
		
		

	}

}
	


