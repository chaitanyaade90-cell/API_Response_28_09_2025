package Package_03_05_2026;

class RunTest
{
	
	public void Manual() {
		
		System.out.println("My role is Manual and Auto");
	}
}

class Onboarding extends RunTest{
	
	public void Automation() {
		
		System.out.println("My work is Testing");
	}
	
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Onboarding o = new Onboarding();
		
		o.Manual();
		o.Automation();

	}

}
