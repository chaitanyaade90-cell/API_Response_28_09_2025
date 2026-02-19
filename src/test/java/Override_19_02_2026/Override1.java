package Override_19_02_2026;

class Regression
{
	
	public void SmokeTest() {
		
		System.out.println("My Tetsing is SmokeTesting");
	}

	public void NonFunctionalTesting() {
		// TODO Auto-generated method stub
		
	}

	public void FunctionalTesting() {
		// TODO Auto-generated method stub
		
	}
}

class Sanity extends Regression{
	
	@Override
	
	public void NonFunctionalTesting() {
		
		System.out.println("My Testing is FunctionalTesting");
		
			
	}
	
}

public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sanity s1 = new Sanity();
		
		s1.SmokeTest();
		s1.FunctionalTesting();

	}

}
