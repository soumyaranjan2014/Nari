package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListInterface {

	public static void main(String[] args) {

	ArrayList<String> ar1=new ArrayList<>();
	
	//addition of element to the array
	ar1.add("Soumya");
	//ar1.add(25);
	ar1.add("Odisha");
	ar1.add("Student");
	System.out.println(ar1);
	
	//pirnt by for each loop
		/*for(String s:ar1)
		{
			System.out.println(s);
		}*/
		
		//print by the help of for loop
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		//add by index
		ar1.add(0,"Binod");
		System.out.println(ar1);
		
		//remove element from array
		ar1.remove(0);
		System.out.println(ar1);
		
		//modifay the array Element
		ar1.set(0,"Rocky");
		System.out.println(ar1);
		
		//to fetch 
		System.out.println(ar1.get(1));
		
		//fetch the size
		System.out.println(ar1.size());

		//remove all the element
		ar1.clear();
		System.out.println(ar1);
		System.out.println(ar1.size());
		
		//creating new arrayList
		ArrayList ar2=new ArrayList();
		ar2.add("Anand");
		ar2.add(29);
		ar2.add("Odisha");
		ar2.add("TestEngeener");
		
		//print all the element
		for(int j=0;j<ar2.size();j++)
		{
			System.out.println(ar2.get(j));
		}
		
		//equals
		System.out.println(ar1.equals(ar2));
		
		//convert to array
		System.out.println(ar2.toArray());
		
		//add all the element of ar1 in ar2;
		ar1.addAll(ar2);
		System.out.println(ar1);
		ar1.add(2,"Kreeti");
		System.out.println(ar1);
		ar1.addAll(ar2);
		System.out.println(ar1);
		
		
		//by the help of itterater acces the elements
		System.out.println("********************************************************");
		Iterator it=ar2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//creating of new ArrayList
		ArrayList ar4=new ArrayList();
		ar4.add("Raja");
		ar4.add("Akash");
		ar4.add(29);
		Collections.sort(ar4);
		System.out.println(ar4);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	

}
