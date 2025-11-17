package Nullpointer_17_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nullpointer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("My name is Chaitanya");
		d1.get("https://www.google.com/");
		
		System.out.println("After the Exception line1");
		System.out.println("After the Exception line2");
		System.out.println("After the Exception line3");

	}

}
