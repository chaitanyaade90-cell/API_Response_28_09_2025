package MethodOverloading_28_03_2026;

class Onboarding
{
	public void CrossFunctional() {
		
		System.out.println("Test plan is document");
	}
}

class VSCode extends Onboarding{
	
	public void SmokeTesting() {
		
		System.out.println("Test Scenario is high level testing");
	}
}

public class Overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VSCode v1 = new VSCode();
		
		v1.CrossFunctional();
		v1.SmokeTesting();

	}

}
