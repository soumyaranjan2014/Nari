import java.util.Scanner;
public class ArrayPrime {
		static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		primeNumber();

	}
	public static void primeNumber()
	{
		int count=0;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==num)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
