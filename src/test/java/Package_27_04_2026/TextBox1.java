package Package_27_04_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www/examples.com");
		
		d1.findElement(By.id("username")).sendKeys("admin");
		d1.findElement(By.id("passwor")).sendKeys("12345");
		

	}

}
