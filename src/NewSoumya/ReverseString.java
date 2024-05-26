package NewSoumya;

public class ReverseString {
	
	public static void main(String[]args) {
//		//reverse number by string buffer and String Builder
//		StringBuffer r=new StringBuffer("AlokRanjan");
//		System.out.println(r.reverse());
//		StringBuilder ref=new StringBuilder("Soumyaranjan jena");
//		System.out.println(ref.reverse());
//		
//		String name="Lokesh kumar";
//		
//		String rev="";
//		for(int a=name.length()-1;a>=0;a--) {
//				rev=rev+name.charAt(a);
//		}
//		System.out.println(rev);
		//
	String n="RockStar Of the Bangaluru";
	StringBuffer ff=new StringBuffer("adnab");
	System.out.println(ff.reverse());
	String reverse="";
	for(int c=n.length()-1;c>0;c--) {
			 reverse=reverse+n.charAt(c);
	}
	System.out.println(reverse);
	

	}

}