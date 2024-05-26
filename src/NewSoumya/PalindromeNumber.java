package NewSoumya;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number=1231;
		int num=number;		
		int sum=0;
		while(num>0) {
			int rem=num%10;
			
			sum=sum*10+rem;
			num/=10;
		}
		System.out.println(sum);
		System.out.println(number);
		if(sum==number) {
			System.out.println("Yes it is a palindrome number");
		}
		else
		{
			System.out.println("No it is not a palindrome number");
		}
	}

}
