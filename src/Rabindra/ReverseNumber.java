package Rabindra;

public class ReverseNumber {

	public static void main(String[] args) {

		int num=123456789;
		int rev=0;
		while(num>0)
		{
			int remender=num%10;
			
			 rev=rev*10+remender;
			num=num/10;
			
		}
		System.out.println(rev);
	}

}
