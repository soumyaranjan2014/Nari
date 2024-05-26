
package Programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//find out the fibonacci number from 1 to 10
		int firstNumber=0;
		int secondNumber=1;
		int sum;
		for(int a=firstNumber;a<=15;a++) {
			System.out.println(firstNumber);
			sum=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=sum;
		}
		
	}

}
