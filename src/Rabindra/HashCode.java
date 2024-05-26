package Rabindra;

public class HashCode {
	
	//int age;
	
public HashCode(int i) {
		// TODO Auto-generated constructor stub
	}
	//	HashCode(int age)
//	{
//		this.age=age;
//	}
	/////Override of hashcode method
	@Override
	public int hashCode()
	{
		int age = 0;
		return age;
	}
	public static void main(String []args)
	{	String Sany = null;
	String name=Sany;

		
		HashCode hs=new HashCode(45);
		HashCode hs1=new HashCode(45);
		HashCode hs2=new HashCode(45);

		System.out.println(hs);
		System.out.println(hs1);
		System.out.println(hs2);

		System.out.println(hs.hashCode());
		System.out.println(hs1.hashCode());
		System.out.println(hs2.hashCode());

		


		
		
		
	}

}
