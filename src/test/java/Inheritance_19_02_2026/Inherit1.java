package Inheritance_19_02_2026;

class Invest
{
	
	public void Inheritnce1() {
		
		System.out.println("My project is ATR");
	}
}

class Project extends Invest{
	
	public void Inheritance2() {
		
		System.out.println("My Role is TE");
	}
	
	}

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project p1 = new Project();
		
		p1.Inheritnce1();
		p1.Inheritance2();
		

	}

}
