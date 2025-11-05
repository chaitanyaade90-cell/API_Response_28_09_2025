package NullPointer_04_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class NullP_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 ChromeDriver d1=null;
	 System.out.println("Hi, My name is Chaitanya");
	 d1.get("https://www.facebook.com/");
	 System.out.println("after excpetion line1");
	 System.out.println("after exception line2");
	 System.out.println("after exception line3");

	}

}
