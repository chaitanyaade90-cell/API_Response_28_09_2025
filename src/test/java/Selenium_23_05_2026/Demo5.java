package Selenium_23_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://demoqa.com/text-box");
		
		d1.findElement(By.xpath("//*[@id='userName']")).sendKeys("chaitanya");
		
		
		

	}

}
