package Inheritance_10_04_2026;

class Runtest
{
	public void ForLoop() {
		
		System.out.println("My project is Runtest");
	}
}

  class Onboarding extends Runtest{
	  
	  public void Hashlist() {
		  
		  System.out.println("My role is PTM");
	  }
  }

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Onboarding o1 = new Onboarding();
		
		o1.ForLoop();
		o1.Hashlist();

	}

}
