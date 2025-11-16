package nullPointer_16_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class NullPointer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1= null;
		System.out.println("Hi how are you");
		d1.get("https://www.google.com");
		System.out.println("after the exeption line1");
		System.out.println("after the exception line2");
		System.out.println("after the exception line3");

	}

}
