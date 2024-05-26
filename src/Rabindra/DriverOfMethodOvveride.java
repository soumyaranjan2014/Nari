package Rabindra;

public class DriverOfMethodOvveride extends MethodOverriding{
	
	
	public void MethodOverriding()
	{
		System.out.println("There are 10 trainers are present");
		System.out.println("Here they provide 6 subjects");

	}

	public static void main(String[] args) {
		DriverOfMethodOvveride mo=new DriverOfMethodOvveride();

		DriverOfMethodOvveride kk=(DriverOfMethodOvveride)mo;
		
		mo.MethodOverriding();
		kk.MethodOverriding();
		
	}

}
