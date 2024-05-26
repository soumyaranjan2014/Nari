package Programs;

public class ReverseAstring {

	public static void main(String[] args) {

		String name="SOUMYARANJAN";
		String a="";
		
		for(int i=0;i<name.length();i++)
		{
			a=name.charAt(i)+a;
		}
		System.out.println(a);
		
	}

}
