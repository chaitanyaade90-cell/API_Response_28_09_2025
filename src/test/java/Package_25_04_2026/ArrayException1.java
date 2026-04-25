package Package_25_04_2026;

public class ArrayException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3};
		
		try {
			System.out.println(arr[5]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is out of range!");
		}

	}

}
