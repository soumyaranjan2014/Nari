import java.util.Scanner;
public class StrongNumber {
	
	
		static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Entre the number");
		int num=sc.nextInt();
		int number=num;
		int sum=0;
		while(number>0)
		{
			int fact=1;
			int rem=number%10;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
				sum=sum+fact;
			}
		}
		if(sum==num)
			
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("not Strong number");
		}
				
	}

}
