package Inheritance_09_01_2026;

class RegressionTesting
{
	
	public void Testing() {
		System.out.println("My Role is QA");
	}
	
}

class SanityTesting extends RegressionTesting{
	
	public void Application() {
		
		System.out.println("My Project is ATR");
	}
	
	
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SanityTesting s1 = new SanityTesting();
		
		s1.Testing();
		s1.Application();
		

	}

}
