package Inheritance_16_03_2026;

class Regression
{
	
	public void Inheritance1() {
		
		System.out.println("Integration testing");
		
	}
}

class Sanity extends Regression{
	
	public void Inheritance2() {
		
		System.out.println("Software Testing");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Sanity s1 = new Sanity();
	  
	 s1.Inheritance1();
	 s1.Inheritance2();
	

	}

}
