package Programs;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num=153;
		int number=num;
		int sum=0;
		
		while(number>0)
		{
			int rem=number%10;
			sum=sum+(rem*rem*rem);
			number/=10;
			
		}
		if(num==sum) {
			System.out.println("Armstrong number");
		}
			
			else {
				System.out.println("not armstrong number");
		}
	}

}
