package Rabindra;

public class SumOfString {

	public static void main(String[] args) {

		String name="Soumya";
		int sum=0;
		for(int i=0;i<name.length();i++)
		{
			
			int a=name.charAt(i)-96;
			
			
			sum=sum+a;
			
			
		}
		System.out.println(sum);
	}

}
