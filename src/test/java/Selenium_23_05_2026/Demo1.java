package Selenium_23_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://www.saucedemo.com");
		
		d1.findElement(By.id("user-name")).sendKeys("chaitanya");
		
		d1.findElement(By.id("password")).sendKeys("secret_sauce");
		
		d1.findElement(By.id("login-button")).click();
		
		Thread.sleep(3000);
		
		System.out.println("login succesfully");
		
		
		
		
		
		

	}
	
		 
	
	}


