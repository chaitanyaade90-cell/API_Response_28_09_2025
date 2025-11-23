package LeapYearCheck_22_11_2025;

import java.util.Scanner;

public class Lyc_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new  Scanner(System.in);
		
		System.out.println("Enter year:");
		
		int year = sc.nextInt();
		sc.close();
		
		if(isLeapYear(year)) {
			
			System.out.println(year + " is a leap year.");
			
		} else {
			System.out.println(year + "is not a leap year.");
			
		}

	}

	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return false;
	}
	
	// Returns
	

}
