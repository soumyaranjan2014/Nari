package Rabindra;

public interface DefaultMethod {
	
	default void m1()
	{
		System.out.println("From parent class");
	}

}
