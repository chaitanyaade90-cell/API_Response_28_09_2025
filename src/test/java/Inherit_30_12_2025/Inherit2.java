package Inherit_30_12_2025;

class Calculator
{
	public void Maths() {
		System.out.println("My subject is Mathematic");
	}
}

class Laptop extends Calculator{
	
	public void Physics() {
		System.out.println("My Roll is QA");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop lp = new Laptop();
		
		lp.Maths();
		lp.Physics();

	}

}
