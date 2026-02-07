package Inheritance_07_02_2026;

class regression
{
	
	public void enviorment() {
		
		System.out.println("Testing enviorment is sys");
		
		
	}
}

class sanity extends regression{
	
	public void enviorment2() {
		
		System.out.println("Functional testing is BBT");
	}
	
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sanity s1 = new sanity ();
		
		s1.enviorment();
		s1.enviorment2();
	}

}
