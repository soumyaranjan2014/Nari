
public class Encapsilation2 {

	public static void main(String[]args) {
		Encapsilation e=new Encapsilation();
		System.out.println(e.getName());
		System.out.println(e.getPwd());
		e.setName("Rockstar");
		e.setPwd(888);
		System.out.println(e.getName());
		System.out.println(e.getPwd());
		
	}
}
