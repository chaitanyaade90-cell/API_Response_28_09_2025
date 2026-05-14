package Package_14_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.facebook.com");	
		
		d1.manage().window().maximize();
		
		WebElement username = d1.findElement(By.id("username"));
		
		username.sendKeys("admin");
		
		
		

	}

}
