package Inheritance_19_04_2026;

class Regression
{
	
	public void Severity() {
		
		System.out.println("My Role is Test Engineer");
	}
}

class Sanity extends Regression{
	
	public void Priority() {
		
		System.out.println("My Role is PTM");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sanity s1 = new Sanity ();
		s1.Severity();
		s1.Priority();

	}

}
