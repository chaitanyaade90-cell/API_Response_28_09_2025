package Package_03_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Array_Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://the-internet.herokuapp.com/login");
		
		String[]username = {"user1", "user2" , "user3"};
		
		String[]password = {"pass1", "pass2" , "pass3"};
		
		for (int i = 0; i < username.length; i++) {
			
			d1.findElement(By.id("username")).clear();
			d1.findElement(By.id("username")).sendKeys(password[i]);
			
			d1.findElement(By.id("password")).clear();
			d1.findElement(By.id("password")).sendKeys(password[i]);
			
			d1.findElement(By.id("login")).click();
			
			System.out.println("Login tried for : " + username[i]);
			
			
			
		}
	}

}
