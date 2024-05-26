import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
			System.out.println("not prime number");

	}}

}
