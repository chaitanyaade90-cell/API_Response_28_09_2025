package Polymorphism_07_02_2026;

class calculator
{
	
	int add(int a, int b){
		return a+b;
		
		}
	
	int add (int a, int b, int c) {
		
		return a+b+c;
		
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator cal = new calculator();
		
		int result1 = cal.add(1000, 2000);
		int result2 = cal.add(200, 300, 500);
		
		System.out.println("Addition of 2 numbers : " + result1);
		System.out.println("Addition of 3 numbers : " + result2);
		

	}

}
