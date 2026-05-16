package Package_16_05_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

@Test
public class MsebTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver().setup();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d1.get("https://wss.mahadiscom.in/wss/wss?uiActionName=getCustAccountLogin");
		
		d1.findElement(By.id("comsumerNo")).sendKeys("12345");
		
		d1.findElement(By.id("submit")).click();
		
		try {
			
			Thread.sleep(3000);
		
		} catch (Exception e)  {
			
			
		}
		
		

	}

}
