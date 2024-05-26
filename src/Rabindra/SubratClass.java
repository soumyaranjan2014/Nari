package Rabindra;

public class SubratClass implements Subrat
{

	@Override
	public void m1()
	{
		System.out.println("ram ram ram");
	}
	public static void main(String[] args) {
		SubratClass sc=new SubratClass();
		sc.m1();
	}

}
