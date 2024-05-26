
public class ArrayPalindrome {
	public static void main(String[] args) {
	int[] ar= {5,9,101,292,16,18};
	for (int i = 0; i < ar.length; i++) {
		int number=ar[i];
		int num=number;
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			sum=(sum*10)+rem;
			number=number/10;
			
		}
		if(num==sum)
		{
			System.out.print(ar[i]+" ");
		}

	}
	}
}

