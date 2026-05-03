package Package_03_05_2026;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		
		String name = sc.nextLine();
		
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
		

	}

}
