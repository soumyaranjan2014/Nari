package NewSoumya;

public class Piramid {

	public static void main(String[] args) {

		int a=5;
		int m=1;;
		for(int i=1;i<=a;i++) {
			for(int j=a-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=m;k++) {
				System.out.print("*");
			}
			m=m+2;
			System.out.println();
			
			
			
		}
	}

}
