import java.util.Collections;

public class Demo {

	public static void main(String[] args) {

		String name="soumyaranjanjena";
		String rev="";
		for(int i=0;i<name.length();i++) {
			 rev=name.charAt(i)+rev;
		}
		 System.out.println(rev);
	}

}
