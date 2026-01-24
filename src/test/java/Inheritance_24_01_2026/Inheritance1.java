package Inheritance_24_01_2026;

class Workflow
{
	
	public void Intrest() {
		
		System.out.println("My bank intrest rate is 7%");
	}
}

class TestCase extends Workflow{
	
	int TestCase=100;
	
	public void intrest2() {
		
		System.out.println(TestCase);
	} 
}


public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Workflow obj = new Workflow();
		
		obj.Intrest();
		
		System.out.println("******************");
		
		TestCase obj2 = new TestCase();
		
		obj2.intrest2();
		

	}

}
