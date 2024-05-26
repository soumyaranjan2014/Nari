import java.util.Scanner;
public class Locators {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(true)
		{
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int number=num;
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			sum=(sum*10)+rem;
			number/=10;
		}
		if(num==sum)
		{
			System.out.println("Palindrom number");
		}
		else
		{
			System.out.println("Not palindrom number");
		}
	
	}}

}
