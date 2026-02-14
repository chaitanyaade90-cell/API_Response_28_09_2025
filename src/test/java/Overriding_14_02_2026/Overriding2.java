package Overriding_14_02_2026;

class onboarding
{
	
	public void Runtest() {
		
		System.out.println("Requirement of Software");
	}

	public void E2E() {
		// TODO Auto-generated method stub
		
	}
}

class Searchresult extends onboarding{
	
	@Override
	
	public void E2E() {
		
		System.out.println("My Project is ATR");
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Searchresult src = new Searchresult();
		
		src.Runtest();
		src.E2E();

	}

}
