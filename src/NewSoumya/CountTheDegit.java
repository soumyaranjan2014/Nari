package NewSoumya;

public class CountTheDegit {
	
	public static void main(String[]args) {
		int number=123567;
		int count=0;
		while(number>0) {
			int rem=number%10;
			count++;
			number/=10;
		}
		System.out.println(count);
	}

}
