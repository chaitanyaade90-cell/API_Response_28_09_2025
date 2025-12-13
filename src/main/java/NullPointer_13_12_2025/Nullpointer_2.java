package NullPointer_13_12_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nullpointer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("How are you");
		d1.get("https://google.com");
		
		System.out.println("Exception on line no 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");

	}

}
