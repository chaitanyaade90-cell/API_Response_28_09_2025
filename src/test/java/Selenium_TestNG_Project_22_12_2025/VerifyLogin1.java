package Selenium_TestNG_Project_22_12_2025;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class VerifyLogin1 {
	
	public void verifyLogin() {
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://gmail.com/login");
		
		d1.findElement(By.id("username")).sendKeys("testuser");
		d1.findElement(By.id("username")).sendKeys("password123");
		d1.findElement(By.id("loginBtn")).click();
		
		String title=d1.getTitle();
		Assert.assertEquals(title, "Dashboard");
	}

}
