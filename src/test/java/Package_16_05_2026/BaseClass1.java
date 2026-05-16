package Package_16_05_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class BaseClass1 {
	
	public void BaseTest() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://wss.mahadiscom.in/wss/wss?uiActionName=getCustAccountLogin");
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d1.findElement(By.id("userName")).sendKeys("Chaitanya");
		
		d1.findElement(By.id("password")).sendKeys("12345");
		
		d1.findElement(By.id("loginButton")).click();
		
		
		
		
			
			
		}
		
		

	}


