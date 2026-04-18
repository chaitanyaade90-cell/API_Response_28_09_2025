package VerifyPageTitle_18_04_2026;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Pageverify2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.google.com");
		
		String title = d1.getTitle();
		
		if(title.equals("Example Domain")) {
			System.out.println("Test Passed");
		
		}else {
			System.out.println("Test Failed");
			
		}

	}

}
