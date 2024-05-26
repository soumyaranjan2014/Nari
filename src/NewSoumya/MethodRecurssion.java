package NewSoumya;

public class MethodRecurssion {

	public static void main(String[] args) {
		Rocky();
		
	}
	 static int num=0;

	public static void Rocky() {
		if(num<10) {
			System.out.println("I love you ");
			num++;
			Rocky();
		
		}
	}

}
