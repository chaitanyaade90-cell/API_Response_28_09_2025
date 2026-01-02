package Inherit_02_01_2026;

class car
{
	String color;
	
	public void drive () {
		
		System.out.println("Start Car");
		
	}
}



public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c1 = new car();
		
		c1.color="Red";
		c1.drive();

	}

}
