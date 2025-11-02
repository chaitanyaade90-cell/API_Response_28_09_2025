package exception_pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class NullPointer_Exampl1 {
	
	public static void main(String[] args) {
		 
		ChromeDriver d1 = null;
		System.out.println("hi, how r u?");
		d1.get("https://www.google.com/");
		System.out.println("after exception lin1");
		System.out.println("after exception lin2");
		System.out.println("after exception lin4");
		
		
	}

}
