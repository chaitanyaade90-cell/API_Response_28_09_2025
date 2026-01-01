package Inheritance_01_01_2026;

class Sanity
{
	public void Maven() {
		System.out.println("My project is ATR");
	}
}

class Smoke extends Sanity{
	
	public void Regression() {
		
		System.out.println("My Role is QA");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smoke s1 = new Smoke();
		s1.Maven();
		s1.Regression();

	}

}
