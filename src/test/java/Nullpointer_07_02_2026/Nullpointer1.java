package Nullpointer_07_02_2026;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nullpointer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("My company name is Coforge");
		d1.get("https://www.gmail.com");
		
		System.out.println("Exception on line no 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");

	}

}
