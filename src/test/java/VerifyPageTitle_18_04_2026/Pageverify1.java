package VerifyPageTitle_18_04_2026;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pageverify1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://example.com");
		
		String title = d1.getTitle();
		
		if(title.equals("Example Domain")) {
			System.out.println("Test Passed");
		
		}else {
			System.out.println("Test Failed");
			
		}
		
		
		

	}

}
