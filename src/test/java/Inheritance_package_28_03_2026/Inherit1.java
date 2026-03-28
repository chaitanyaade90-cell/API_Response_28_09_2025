package Inheritance_package_28_03_2026;

class Regression
{
	
	public void Integer() {
		
		System.out.println("My role is PTM");
	}
}

class Sanity extends Regression{
	
	public void Software () {
		
		System.out.println("My Designation is Associate");
	}
}


public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sanity s1 = new Sanity();
		
		s1.Software();
		s1.Integer();

	}

}
