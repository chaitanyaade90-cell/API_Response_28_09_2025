package Package_03_05_2026;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 20;
		
		boolean hasLicense =true;
		
		if(age >=18) {
			
			if(hasLicense) {
				
				System.out.println("You can drive");
			
			}else {
				
				System.out.println("you need a license");
			}
		}else {
			
			System.out.println("You are underage");
		}

	}

}
