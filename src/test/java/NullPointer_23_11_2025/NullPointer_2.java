package NullPointer_23_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class NullPointer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  ChromeDriver d1=null;
	  System.out.println("Delhi is a capital of india");
	  d1.get("https://www.facebook.com/");
	  
	  System.out.println("Excpetion on line 1");
	  System.out.println("Exception on line no 2");
	  System.out.println("Exception on line no 3");

	}

}
