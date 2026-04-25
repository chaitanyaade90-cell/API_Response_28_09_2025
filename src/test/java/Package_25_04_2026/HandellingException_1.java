package Package_25_04_2026;

public class HandellingException_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 10;
		int b = 0;
		
		try {
			int result = a / b;
			System.out.println(result);
		
		}catch (ArithmeticException e) {
			
			System.out.println("Cannot divide by zero!");
		}
		
		System.out.println("Programme Continues..");

	}

}
