package Selenium_07_02_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1= new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://www.facebook.com");
		
		WebElement emailid = d1.findElement(By.id("email"));
		emailid.sendKeys("chaitanyaade90@gmail.com");
		
		WebElement password = d1.findElement(By.id("pass"));
		password.sendKeys("09chaitanys");
		
		WebElement loginid = d1.findElement(By.name("login"));
		loginid.click();
		

	}

}
