package Selenium_23_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.findElement(By.xpath("//*[@id='user-name']")).sendKeys("chaitanya");
		
		
		
		d1.findElement(By.xpath("//*[@id='password']")).sendKeys("admin12345");
		
		d1.findElement(By.xpath("//*[@id='login-button']")).sendKeys("loginbtn");
		
		
		
		
		

	}

}
