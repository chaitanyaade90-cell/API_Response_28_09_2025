package NullPointer_24_01_2026;

import org.openqa.selenium.chrome.ChromeDriver;

public class NullPointer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("How are you");
		d1.get("https://www.girhub.com");
		
		System.out.println("Exception on line no 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");

	}

}
