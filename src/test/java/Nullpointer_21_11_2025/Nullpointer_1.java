package Nullpointer_21_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nullpointer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("my name is chaitanya");
		d1.get("https://www.facebook.com/");
		
		System.out.println("Exception on line no 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");

	}

}
