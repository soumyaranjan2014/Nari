import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int number=num;
		int sum=0;
		while(number>0)
		{
			int rem=number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
			
		}
		if(num==sum)
		{
			System.out.println("Armstrong");
		}
		else
			System.out.println("not armstron");
	}}

}
