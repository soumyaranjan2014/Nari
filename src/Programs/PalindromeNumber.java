package Programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		//if the number is equals to reverse number is known as pallindrome number;

		int number=123;
		int num=number;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(number==rev) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not palindrome number");		
		}
	}

}
