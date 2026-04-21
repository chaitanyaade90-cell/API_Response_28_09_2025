package Exception_21_04_2026;

public class ExceptionHandle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=10;
			int b = 0;
			
			System.out.println(a/b);
			
		}catch (Exception e)
		{
			System.out.println("Error handle");
		}
	}

}
