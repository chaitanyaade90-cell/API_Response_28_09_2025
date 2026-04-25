package Package_25_04_2026;

public class HandellingException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 200;
		int b = 300;
		
		try {
			
			int result = a/b;
			System.out.println(result);
		
		}catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		
		System.out.println("Program continues..");

	}

}
