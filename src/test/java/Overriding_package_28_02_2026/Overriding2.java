package Overriding_package_28_02_2026;

class Sanity
{
	public void Testing() {
		
		System.out.println("My Testing is Sanity");
	}

	public void Software() {
		// TODO Auto-generated method stub
		
	}
}

class Regression extends Sanity{
	
	@Override
	
	public void Software() {
		
		System.out.println("My TestCases on ADO");
		
	}
		
	}


public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Regression rg = new Regression();
		
		rg.Testing();
		rg.Software();

	}

}
