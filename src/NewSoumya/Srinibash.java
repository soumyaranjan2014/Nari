
package NewSoumya;

import java.util.Scanner;

public class Srinibash {
	public static void main(String[]args) {
		
		String name[]= {"Rocky","Bicky","kalia","jacky","Rocky","Bicky"};
		
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i]==name[j]) {
					System.out.println("The duplicate values are "+name[i]);
				}
				
				
			}
		}
		
		
		
		
		}
}