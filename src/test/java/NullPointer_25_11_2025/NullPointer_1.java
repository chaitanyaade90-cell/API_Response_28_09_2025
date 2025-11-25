package NullPointer_25_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class NullPointer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("My name is CA");
		d1.get("https://www.gmail.com/");
		
		System.out.println("Exception on line no 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");
		

	}

}
