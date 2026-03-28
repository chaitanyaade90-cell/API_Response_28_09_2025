package Inheritance_package_28_03_2026;

class SQMMinion
{
	
	public void SonarQube() {
		
		System.out.println("NonFunctional Testing");
	}
}

class RunTest extends SQMMinion{
	
	public void CoreRefrence() {
		
		System.out.println("Universal Automation");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunTest r1 = new RunTest();
		
		r1.SonarQube();
		r1.CoreRefrence();

	}

}
