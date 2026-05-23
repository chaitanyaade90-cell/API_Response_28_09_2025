package Selenium_23_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium2 {
	
	public void login () {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://demo.opencart.com/");
		
		d1.findElement(By.xpath("//*[@id='search']/input]")).sendKeys("iphone");
		
		d1.findElement(By.xpath("//*[@id=\"menu\"]/'button']")).click();
		
		d1.findElement(By.xpath("//*[@id='header-cart']/div/'button']")).click();
		
		d1.quit();
		
		

	}

}
