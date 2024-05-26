package NewSoumya;

import java.util.Scanner;

public class NumberOfWordCountInString {
	public static void main(String[]args) {
		
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value");
		String name=sc.nextLine();
		int count=1;
		for(int i=0;i<name.length()-1;i++) {
		if((name.charAt(i)==' ')&& (name.charAt(i+1)!=' ')){
			count++;
		}
		}
		System.out.println("The number of word in string is "+count);

	}
	}

}
