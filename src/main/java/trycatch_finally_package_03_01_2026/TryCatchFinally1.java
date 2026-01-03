package trycatch_finally_package_03_01_2026;

public class TryCatchFinally1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int a = 10/2;
			System.out.println(a);
		
		}catch (ArithmeticException e) {
			
			System.out.println("Error occured");
		
		}
		
		finally {
			System.out.println("Finally block always execute");
		}

	}

}
