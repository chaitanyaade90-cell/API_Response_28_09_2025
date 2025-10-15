package Selenium_Project_15_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://mail.google.com/mail/u/0/#inbox");
		d1.manage().window().maximize();
		
		WebElement emailid=d1.findElement(By.id("email"));
		emailid.sendKeys("chaitanyaade90@gmail.com");
		
		WebElement password=d1.findElement(By.name("pass"));
		password.sendKeys("chaitu@1234");
		
		WebElement loginbutton=d1.findElement(By.name("login"));
		loginbutton.click();
		
		

	}

}
