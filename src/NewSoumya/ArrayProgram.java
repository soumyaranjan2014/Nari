package NewSoumya;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int temp;
		int ar[]=new int[4];
		System.out.println("Enter the array elements");
		for(int i=0;i<4;i++) {
			ar[i]=sc.nextInt();

		}
		for(int i=0;i<4;i++) {
			for(int j=i+1;i<4;j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<=4;i++) {
			System.out.println(ar[i]);
		}
	}

}
