package Programs;

public class Swaping {

	public static void main(String[] args) {

		int a=30;
		int b=20;
		System.out.println("Before swaping of a and b is "+a+" "+b);
		//logic 1 with third veriable 
		/*int t=a;
		a=b;
		b=t;*/
		
		//logic 2 without using third veriable
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swaping of a and b is "+a+" "+b);
	}

}
