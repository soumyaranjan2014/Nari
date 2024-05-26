package Programs;

public class DuplicateElementArray {

	public static void main(String[] args) {

			
			String []name= {"Soumya","java","Soumya","rocky","java"};
			
			
			for(int i=0;i<=name.length-1;i++) {
				for(int j=i+1;j<name.length;j++) {
					if(name[i]==name[j]) {
						System.out.println(name[i]);
					}
					
				}
			}
			
		
	}

}
