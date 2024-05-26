package NewSoumya;

public class DuplicateRemove {
	public static void main(String []args) {
		
		String name[]= {"Santosh","alok","Santosh","Bikash","alok","a",};
		for(int i=0;i<=name.length-1;i++) {
			//System.out.println(name[i]);
			for(int j=i+1;j<=name.length-1;j++) {
				if(name[i]==name[j]) {
					System.out.println(name[i]);
				}
			}
			
		}
		
		
	}

}
