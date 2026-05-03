package Package_03_05_2026;

class Calculator
{
	int add(int a, int b, int c) {
		return a+b;
		
	}
	
	int add1(int a, int b, int c) {
		return a+b+c;
	}
	
}

public class OverrloadingExamples1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		
		System.out.println(c.add(10, 20, 30));
		System.out.println(c.add(40, 50, 60));

	}

}
