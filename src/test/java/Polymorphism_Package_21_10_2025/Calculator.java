package Polymorphism_Package_21_10_2025;

public class Calculator {
	
	// add 2 parameters 
	
	public void add(int a, int b) {
		
		System.out.println("SUM: " +(a+b));
	} 
	
	// add with 3 parameters
	
	public void add(int a, int b, int c) {
		
		System.out.println("SUM : " + (a + b + c));
	}
	
	public class Demo {
		
		
	}
		
		Calculator c=new Calculator();
		c.add(5,10); // Calls 2 parameter method
	
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
