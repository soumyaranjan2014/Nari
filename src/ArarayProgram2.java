import java.util.Collections;
import java.util.Scanner;

public class ArarayProgram2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int []arr=new int[5];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr [i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(arr);
		

	}

}
