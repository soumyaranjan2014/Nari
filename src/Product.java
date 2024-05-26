
public class Product {

	public static int power(int a,int b)
	{
		int prod=1;
		int count=0;
		while(b!=0)
		{
			prod=prod*a;
			count--;
			
		}
		return prod;
	}
	public static void main(String[] args) {
		System.out.println(power(4,4));

	}
	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
	}

}
