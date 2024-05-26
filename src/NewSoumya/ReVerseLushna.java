package NewSoumya;

public class ReVerseLushna {
	

	public static void main(String []args) {
		
	
	String name="Lushna";
	char temp;
	for(int i=0;i<name.length();i+=2) {
		char firstno=name.charAt(i);
		char secondno=name.charAt(i+1);
		temp=firstno;
		firstno=secondno;
		secondno=temp;
		System.out.print(firstno);
		System.out.print(secondno);
	}
}
}