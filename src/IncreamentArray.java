import java.util.Scanner;

public class IncreamentArray {

	public static void main(String[] args) {
//INCREAMENTAL ORDER IN ARRAY
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
