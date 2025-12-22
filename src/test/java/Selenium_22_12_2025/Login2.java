package Selenium_22_12_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://www.gmail.com/");
		
		System.out.println("Page title " + d1.getTitle());
		
		d1.quit();

	}

}
