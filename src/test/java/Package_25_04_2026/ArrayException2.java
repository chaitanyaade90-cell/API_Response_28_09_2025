package Package_25_04_2026;

public class ArrayException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= { 100,200,300};
		
		try {
			System.out.println(arr[5]);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Index is out of range");
		}

	}

}
