package Programs;

public class SumOfstring {

	public static void main(String[] args) {

		String name="Alok";
		int rev=0;
		
		for(int i=0;i<name.length();i++) {
			
			 rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		
		
	}

}
