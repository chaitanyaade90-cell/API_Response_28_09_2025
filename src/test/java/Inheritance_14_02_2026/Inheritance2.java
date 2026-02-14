package Inheritance_14_02_2026;

class Selenium
{
	
	public void Testing() {
		
		System.out.println("Regression testing");
	}
}

class Software extends Selenium{
	
	public void NonTesting() {
		
		System.out.println("My role is TE");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Software soft = new Software();
		
		soft.Testing();
		soft.NonTesting();
		
		

	}

}
