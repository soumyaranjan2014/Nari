import java.util.Scanner;
public class Factors {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		///factors in java like 6--1,2,3,6
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);

			}
		}
	}

}
