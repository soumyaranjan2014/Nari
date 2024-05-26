package Rabindra;

public class Strings {

	public static void main(String[] args) {
String a="ram";
String b="RAM";
		String name="SoumyaRanjan Jneea";
		//7 methods of String
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.startsWith("Soumya"));
		System.out.println(name.endsWith("Jneea"));
		System.out.println(name.concat(a));
		System.out.println(name.length());
		//4 methods of String
		System.out.println(name.contains("Soumya"));
		System.out.println(name.charAt(5));
		System.out.println(name.substring(2,10));
		System.out.println(name.replace('e','k'));
		//3 methods of 
		System.out.println(name.equals(a));
		System.out.println(a.equalsIgnoreCase(b));
		
		
		
	}

}
