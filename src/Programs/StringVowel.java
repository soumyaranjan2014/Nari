package Programs;

public class StringVowel {

	public static void main(String[] args) {
		
		//char ch;
		String name="soumya";
		for(int i=0;i<name.length();i++) {
			
		char 	ch=name.charAt(i);
			System.out.println(ch);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println("its a vowel");
				
			}
			else {
				System.out.println("its not a vowel");
			}
		}
	}

}
