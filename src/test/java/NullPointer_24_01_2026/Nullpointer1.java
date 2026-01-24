package NullPointer_24_01_2026;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nullpointer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("My roll number is 9");
		d1.get("https://www.facebook.com");
		
		System.out.println("Exception on line 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");

	}

}
