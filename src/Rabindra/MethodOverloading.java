package Rabindra;

public class MethodOverloading {
	
	
	
	public void classRoom(String subjects) {
		System.out.println("Java");
		System.out.println("Manual");

		System.out.println("sql");
		System.out.println("selenium");
	}
	public void classRoom(int  sudents) {
		System.out.println("The total number of student is 5000");
	}
	public void classRoom(String teachers,String subject) {
		System.out.println("Barun sir for java");
		System.out.println("Bijay sir for sql");
		System.out.println("Anusruti mam for Seleniium");
		System.out.println("Nischal sir for Manul");

	}


	public static void main(String[] args) {

		MethodOverloading mo=new MethodOverloading();
		mo.classRoom("qspider");
		mo.classRoom(5555);
		mo.classRoom("qspider","okk");

	}

}
