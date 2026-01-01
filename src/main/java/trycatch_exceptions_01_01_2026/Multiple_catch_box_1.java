package trycatch_exceptions_01_01_2026;

public class Multiple_catch_box_1 {

	public static void main(String[] args) throws NullpointerException {
		// TODO Auto-generated method stub
		
		try {
			
			String s = null;
			System.out.println(s.length());
		}
		
		catch (Exception e) {
			
			System.out.println("General exception");
		}

	}

}
