package Selenium_09_02_2026;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {

	private static Object success;
	private static boolean isDisplayed;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.facebook.com");
		
		d1.manage().window().maximize();
		
		
		
		
		d1.findElement(By.id("menu")).click();
		
		d1.findElement(By.id("menu")).click();
		
		d1.findElement(By.id("clickButton")).click();
		
		d1.findElement(By.id("success message")).isDisplayed();
		
		Assert.assertTrue(isDisplayed, "E2E is failed");
		
		System.out.println("Test Passsed");
		
		
		
		

	}

}
