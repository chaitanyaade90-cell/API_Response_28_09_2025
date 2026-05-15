package Package_15_05_2026;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int a = 10;
			int b = 0;
			
			int c = a/b;
			
			System.out.println(c);
		
		} catch (ArithmeticException e) {
			
			System.out.println("Cannot divide by zero");
		
		}
		
		System.out.println("programme continues");

	}

}
