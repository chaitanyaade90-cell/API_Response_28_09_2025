package FullLoginTest_package_22_04_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullLogin_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.examples.com");
		
		d1.findElement(By.id("username")).sendKeys("admin");
		
		d1.findElement(By.id("password")).sendKeys("12345");
		
		d1.findElement(By.id("loginBtn")).click();
		
		String title = d1.getTitle();
		
		if (title.contains("Dashboard"));
		System.out.println("Login Succesfull");

	}

}
