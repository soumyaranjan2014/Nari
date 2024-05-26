package Programs;

public class CountOfEWordsInString {
	public static void main(String[]args) {
		String name="Soumya ranjan jena and Monalisha jena";
		int count=0;
		for(int i=0;i<name.length()-1;i++) {
			if((name.charAt(i)==' ')&& (name.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
