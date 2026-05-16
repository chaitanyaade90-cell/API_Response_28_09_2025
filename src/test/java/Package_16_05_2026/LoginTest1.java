package Package_16_05_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

@Test

public class LoginTest1 {
	
	public void loginFunctionality() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d1.get("https://wss.mahadiscom.in/wss/wss?uiActionName=getViewPayBill");
		
		
		
		WebElement password = d1.findElement(By.id("password"));
		
		WebElement username = d1.findElement(By.id("username"));
		
		WebElement loginButton = d1.findElement(By.id("loginBtn"));
		
		username.sendKeys("admin");
		
		username.sendKeys("password");
		
		loginButton.click();
		
		

	}

}
