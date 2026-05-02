package Package_02_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("htpps://www.facebook.com");
		
		By username = By.id("username");
		By password = By.id("Password");
		By loginBtn = By.id("loginBtn");
		
		
		
		
		

	}

}
