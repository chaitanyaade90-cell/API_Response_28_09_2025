package GoogleSearch_18_04_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.google.com");
		
		d1.findElement(By.name("q")).sendKeys("Selenuim");
		
		d1.findElement(By.name("q")).submit();
		
		d1.quit();
	}

}
