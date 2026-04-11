package Selenium_Package_11_04_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://example.com/login");
		
		d1.findElement(By.id("username")).sendKeys("user1");
		
		d1.findElement(By.id("password")).sendKeys("pass1");
		
		d1.findElement(By.id("loginbtn")).sendKeys("click");
		

	}

}
