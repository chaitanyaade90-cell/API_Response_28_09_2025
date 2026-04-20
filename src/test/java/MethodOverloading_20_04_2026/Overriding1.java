package MethodOverloading_20_04_2026;

class parent
{
	public void show() {
		System.out.println("Parent Method");
	}
}

class child extends parent{
	
	@Override
	
	public void show() {
		System.out.println("Child method");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child c1 = new child();
		
		c1.show();
		c1.show();

	}

}
