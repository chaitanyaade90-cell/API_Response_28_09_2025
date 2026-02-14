package Overriding_14_02_2026;

class parent
{
	
	public void show() {
		
		System.out.println("Parent Method");
	}

	public void show1() {
		// TODO Auto-generated method stub
		
	}
}

class child extends parent{
	
	@Override
	
	public void show1() {
		
		System.out.println("Child method");
		
	}
}

public class Overriding_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child chi = new child();
		
		chi.show();
		chi.show1();

	}

}
