import java.util.Scanner;
public class Factorial {
		static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//5=120
		int fact=1;
		while(true)
		{
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	}
}
