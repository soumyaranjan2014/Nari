import java.util.Scanner;
public class BinaryNumber {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		while(true)
		{
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0 && num%i==1)
			{
				System.out.println(num+" binary number");
			}
			else
			{
				System.out.println(num+"is not binary number");
			}
		}
		
	}

}}
