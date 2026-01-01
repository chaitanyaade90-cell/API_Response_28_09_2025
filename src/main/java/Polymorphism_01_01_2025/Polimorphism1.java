package Polymorphism_01_01_2025;

class Calculator
{
	
		int add(int a, int b) {
			
			return a+b;
			
			
		}
		
		int add(int a, int b, int c) {
			
			return a+b+c;
			
		}
}

public class Polimorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		
		int result1 = cal.add(100, 200);
		int result2 = cal.add(200, 300, 500);
		
		System.out.println("Addition of 2 numbers: " + result1);
		System.out.println("Addition of 3 numbers: " + result2);

	}

}
