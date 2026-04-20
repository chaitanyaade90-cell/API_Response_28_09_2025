package LoginTest_20_04_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://example.com/login");
		
		d1.findElement(By.id("username")).sendKeys("admin");
		
		d1.findElement(By.id("password")).sendKeys("1234");
		
		d1.findElement(By.id("loginBtn")).click();
		
		System.out.println("Login Executed");

	}

}
