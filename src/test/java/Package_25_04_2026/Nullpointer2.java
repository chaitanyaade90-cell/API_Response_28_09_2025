package Package_25_04_2026;

public class Nullpointer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = null;
		
		try {
			System.out.println(name.length());
		
		}catch (NullPointerException e) {
			
			System.out.println("String is null");
		}

	}

}
