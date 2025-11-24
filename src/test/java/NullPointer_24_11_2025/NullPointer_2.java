package NullPointer_24_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class NullPointer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("My Company is Coforge");
		d1.get("https://www.github.com/");
		System.out.println("My name is Chaitanya");
		
		System.out.println("Exception on line 1");
		System.out.println("Exception on line 2");
		System.err.println("Exception on line 3");
		

	}

}
