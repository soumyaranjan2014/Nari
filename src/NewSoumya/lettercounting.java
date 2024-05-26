package NewSoumya;

public class lettercounting {
	
	public static void main(String[]args) {
		String name="rocky";
		int count=0;

		for(int a=0;a<=name.length()-1;a++) {
			char ch=name.charAt(a);
			count++;
			System.out.println(ch);
		}
		System.out.println(count);
	}

}
