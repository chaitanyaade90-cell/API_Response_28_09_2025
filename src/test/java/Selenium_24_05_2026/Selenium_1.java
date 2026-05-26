package Selenium_24_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

@Test
public class Selenium_1 {
	
	public void Login1() {
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://www.saucedemo.com");
		
		d1.findElement(By.id("user-name")).sendKeys("standard_user");
		
		d1.findElement(By.id("password")).sendKeys("secret_sauce");
		
		d1.findElement(By.id("login-button")).click();
		
		String title = d1.getTitle();
		
		if(title.contains("Swag")) {
			System.out.println("Login passed");
			
			
		}else {
			System.out.println("Login failed");
			
			
			Thread.sleep(1000);
			
			d1.findElement(By.id("logout_sidebar_link")).click();
			
			System.out.println("Logout Succesfull");
		}

	}

}
