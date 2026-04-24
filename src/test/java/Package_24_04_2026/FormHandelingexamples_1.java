package Package_24_04_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormHandelingexamples_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://demoqa.com/automation-practice-form");
		
		d1.findElement(By.id("firstName")).sendKeys("Chaitanya");
		d1.findElement(By.id("lastName")).sendKeys("Ade");
		d1.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		
		
		
		d1.findElement(By.id("userNumber")).sendKeys("9130839142");

	}

}
