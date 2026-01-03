package Ovveride_package_03_01_2026;

class employee
{
	public void Salary() {
		
		System.out.println("All employees are on Seniour post");
	}

	public void project() {
		// TODO Auto-generated method stub
		
	}
}

class post extends employee{
	
	@Override
	public void project() {
		
		System.out.println("All employee working on ATR project");
	}
}

public class OvverideClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		post p1 = new post();
		
		p1.Salary();
		p1.project();

	}

}
