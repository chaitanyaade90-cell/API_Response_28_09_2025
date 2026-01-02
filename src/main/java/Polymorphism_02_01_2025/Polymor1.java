package Polymorphism_02_01_2025;

abstract class Mathop
{
	
	
	public abstract void show();
	
	int add (int a , int b) {
		
		return a+b;
		
	}


int add (int a, int b, int c) {
	
	return a+b+c;
}
	
}



public class Polymor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mathop m1 = new Mathop();
		m1.add(20, 30);
		m1.add(100, 200, 300);	

	}

}
