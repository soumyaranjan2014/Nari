package NewSoumya;

import java.util.Scanner;

public class NumberPartern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int k=sc.nextInt();
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

}
