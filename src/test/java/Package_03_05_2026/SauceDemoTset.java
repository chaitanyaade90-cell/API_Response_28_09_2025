package Package_03_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://www.saucedemo.com/");
		
		d1.findElement(By.id("user-name")).sendKeys("standard_user");
		d1.findElement(By.id("password")).sendKeys("secret_sauce");
		d1.findElement(By.id("login-button")).click();
		
		d1.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		d1.findElement(By.className("shopping_cart_link")).click();
		
		

	}

}
