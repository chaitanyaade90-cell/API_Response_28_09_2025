package Inheritance_10_04_2026;

class Regression
{
	
	public void Bank1() {
		
		System.out.println("My role is QA");
	}
}
  class Sanity extends Regression{
	  
	  public void Bank2() {
		  
		  System.out.println("My position is Manager");
	  }
  }

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sanity s1 = new Sanity();
		
		s1.Bank1();
		s1.Bank2();

	}

}
