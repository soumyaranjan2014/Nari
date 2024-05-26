package NewSoumya;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the number");
		
		int number=sc.nextInt();
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				
				count++;
			}
		}
		if(count==2) {
			System.out.println("yes "+number+" is a prime number");
		}
		else {
			System.out.println("No "+number+" is not a prime number");
		}
	}
	}
}
