package Element_01_07_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://practicetestautomation.com/practice-test-login/");
		
		d1.manage().window().maximize();
		
		WebElement username = d1.findElement(By.id("username"));
		
		username.sendKeys("students");
		
		WebElement password = d1.findElement(By.id("password"));
		
		password.sendKeys("password123");
		
		WebElement loginButton = d1.findElement(By.id("submit"));
		
		loginButton.click();
		
		
		
		

	}

}
