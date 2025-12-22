package NullPointer_22_12_2025;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nullpointer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1=null;
		System.out.println("My Team is CCM");
		d1.get("https://www.gmail.com/");
		d1.manage().window().maximize();
		
		System.out.println("Exception on line 1");
		System.out.println("Exception on line no 2");
		System.out.println("Exception on line no 3");
		

	}

}
