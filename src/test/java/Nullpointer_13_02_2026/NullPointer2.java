package Nullpointer_13_02_2026;

import org.openqa.selenium.chrome.ChromeDriver;

public class NullPointer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1 = null;
		System.out.println("My role is QA");
		d1.get("https://www.gmail.com");
		
		System.out.println("Exception on line no 1");
		System.out.println("Excpetion on line no 2");
		System.out.println("Exception on line no 3");

	}

}
