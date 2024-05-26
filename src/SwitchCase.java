import java.util.Scanner;
public class SwitchCase {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int Balance=5000;
		boolean exit=true;
		while(exit)
		{
		System.out.println("*****Welcome to Andhra Bank Atm********");
		System.out.println("1.Account balnce\n2.Account details\n3.Deposit money\n4.Withdrawal money\n5.exit");
		System.out.println("Please enter any choice>>>>>>>>>>>>>>>>>");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Your account balance is :"+Balance);
			
		break;
		case 2:
			System.out.println("1.Account name is Soumyaranjan jena\n2.Your Balance is "+Balance);
		break;
		case 3:
			System.out.println("Enter amount to be deposited");
			 int amount=sc.nextInt();
			 System.out.println("Your amount is "+amount+"deposited succesfully");
			 Balance=Balance+amount;
			 break;
		case 4:
			System.out.println("Please enter your pin");
			int pin=sc.nextInt();
			if(pin==123)
			{
			System.out.println("Enter amount You want to withdraw");
			int withdraw=sc.nextInt();
			
			System.out.println(withdraw+"is withdraw succesfully");
			Balance=Balance-withdraw;
			}
			else {
				System.out.println("Invalid pin");
			}
			break;
		case 5:
			exit=false;
			System.out.println("Thank you for useing Andhra bank)))))))))))))))");
			break;
			default :
				System.out.println("Invalid choice");
			
		}
	}}

}
