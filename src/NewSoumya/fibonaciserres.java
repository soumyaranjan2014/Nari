package NewSoumya;

public class fibonaciserres {
	public static void main(String[]args) {
	int firstno=0;
	int secondno=1;
	int sum;
	for(int i=0;i<=15;i++) {
		System.out.println(firstno);

		sum=firstno+secondno;
		firstno=secondno;
		secondno=sum;
		
	}
	}

}
