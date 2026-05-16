package Package_16_05_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

@Test
public class MsebLogin {
	
	public void LoginMseb() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 =  new ChromeDriver();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d1.get("https://wss.mahadiscom.in/wss/wss?uiActionName=getCustAccountLogin");
		
		d1.findElement(By.id("username")).sendKeys("password");
		
		d1.findElement(By.id("loginButton")).click();
		
		System.out.println("LoginSuccesfull");
		
		try { 
			Thread.sleep(5000);
			
		}catch (Exception e) {
			
			d1.close();
		}
		
		

	}

}
