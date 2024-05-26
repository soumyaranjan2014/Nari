package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ShortingOfArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList ar=new ArrayList();
		
		ar.add("Rajesh");
		ar.add("Bijay");
		ar.add("Ajay");
		//ar.add(29);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		
		
		
	}

}
