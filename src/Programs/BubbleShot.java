package Programs;

import java.util.Arrays;

public class BubbleShot {
	
	public static void main(String[]args) {
		int a[]= {5,8,7,4,3,2};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}

			}
			
			
		}
		System.out.println(Arrays.toString(a));

		
	}

}
