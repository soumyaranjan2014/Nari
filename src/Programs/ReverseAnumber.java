package Programs;

public class ReverseAnumber {

	public static void main(String[] args) {

		long num=12345678901l;
		long rev=0;
		
		while(num>0)
		{
			long rem=num%10;
			rev=rev*10+rem;
			num/=10;
			
		}
		System.out.println(rev);
	}

}
