package Nullpointer_17_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class NullPointer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("My name is chaitanya");
		d1.get("https://www.facebook.com/");
		
		System.out.println("After Exception line no1 ");
		System.out.println("After Exception line no2");
		System.out.println("After Exception line no3");
		

	}

}
