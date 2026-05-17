package Package_17_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

@Test

public class Login3 {
	
	public void log3() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://practicetestautomation.com/practice-test-login/");
		
		d1.findElement(By.id("username")).sendKeys("student");
		
		d1.findElement(By.id("password")).sendKeys("Password123");
		
		d1.findElement(By.id("submit")).click();
		
		Thread.sleep(30);
		
		
		
		

	}

}
