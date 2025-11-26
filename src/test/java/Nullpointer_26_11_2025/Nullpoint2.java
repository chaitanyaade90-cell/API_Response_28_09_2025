package Nullpointer_26_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nullpoint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		d1.get("https://www.facebook/");
		System.out.println("My name is chaitanya");
		
		System.out.println("Exception on line no 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");

	}

}
