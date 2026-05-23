package Selenium_23_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class SauceDemo1 {
	
	public void sauce1() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://demo.opencart.com");
		
		d1.findElement(By.xpath("//*[@id='user-name']")).click();
		
		d1.findElement(By.xpath("//*[@id='password']")).click();
		
		d1.findElement(By.xpath("//*[@id='login-button']")).click();

	}

}
