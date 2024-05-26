import java.util.Scanner;
import java.util.Scanner;
public class ArrayDecreament1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i==j)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			

		}
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(i+j==num+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}}
