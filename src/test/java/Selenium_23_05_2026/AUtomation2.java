package Selenium_23_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class AUtomation2 {
	
	public void Auto1() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://www.saucedemo.com");
		
		d1.findElement(By.xpath("//*[@id='user-name']")).sendKeys("john");
		
		d1.findElement(By.xpath("//*[@id='password']")).sendKeys("demo");
		
		d1.findElement(By.xpath("//*[@id='login-button']")).click();
		
		System.out.println("Login Succesfully");
		
		Thread.sleep(1000);
		
		d1.quit();
		
		
	
		
		

	}
	

}
