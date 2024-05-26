package NewSoumya;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num=152;
		int number=num;
		int sum=0;
		while(number>0) {
			int rem=number%10;
			sum=sum+rem*rem*rem;
			number=number/10;			
		}
		if(num==sum) {
			System.out.println("Yes it is a palindrome number");
		}
		else
		{
			System.out.println("No it is not a palindrome number");
		}
	}

}
