package Rabindra;

public class EqualsMethod {
	
/////////Example of Override of equals method to compair with value otherwise it will compair with address
	String name;
	int age;
	EqualsMethod(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public boolean equals(Object obj)
	{
		EqualsMethod em=(EqualsMethod)obj;
		return this.name==em.name && this.age==em.age;
	}
	public static void main(String []args)
	{
		EqualsMethod ef=new EqualsMethod("raja",55);
		EqualsMethod ef1=new EqualsMethod("baja",44);
		EqualsMethod ef2=new EqualsMethod("raja",55);

		System.out.println(ef.equals(ef1));
		System.out.println(ef.equals(ef2));

				
	}
	
}
