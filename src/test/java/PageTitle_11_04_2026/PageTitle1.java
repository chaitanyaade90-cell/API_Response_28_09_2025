package PageTitle_11_04_2026;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTitle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		String title = d1.getTitle();
		
		if(title.equals("ExampleDomain")) {
			
		}
		System.out.println("Test passed");
		
	
		System.out.println("Test failed");
		
	}

}
