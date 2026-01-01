package Xpath_01_01_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExamples_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.example.com");
		
		d1.manage().window().maximize();
		
		d1.findElement(By.id("username")).sendKeys("admin");
		d1.findElement(By.id("password")).sendKeys("admin123");
		d1.findElement(By.id("//button[text()='Login']")).click();
		d1.navigate().back();

	}

}
