package Rabindra;

public class ToStringMethod {
	String name;
	int age;
	ToStringMethod(String name,int age)
	{
		this.name=name;
		this. age=age;
	}
	public String toString()
	{
		
		return name+age;
		
	}
	public static void main(String[]args)
	{
		ToStringMethod t=new ToStringMethod("Soumya",55);
		System.out.println(t);
	}

}
