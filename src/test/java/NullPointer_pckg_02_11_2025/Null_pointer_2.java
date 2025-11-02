package NullPointer_pckg_02_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class Null_pointer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("Hi, how are you");
		d1.get("https://www.facebook.com");
		System.out.println("after exception line1");
		System.out.println("after exception line2");
		System.out.println("after exception line3");

	}

}
