package pkg1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFb_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://www.facebook.com/");
		WebElement emailid=d1.findElement(By.id("email"));
		emailid.sendKeys("chaitanyaade90@gmail.com");
		
		WebElement password=d1.findElement(By.id("pass"));
		password.sendKeys("09chaitanys");
		WebElement loginButton=d1.findElement(By.name("login"));
		loginButton.click();
		
		
				
	}

}
