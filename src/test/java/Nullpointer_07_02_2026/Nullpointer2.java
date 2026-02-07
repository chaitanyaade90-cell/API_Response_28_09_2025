package Nullpointer_07_02_2026;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nullpointer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("My compnay is service based");
		d1.get("https://facebook.com");
		
		System.out.println("Exception on line no 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");

	}

}
