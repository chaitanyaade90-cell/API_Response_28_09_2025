package Package_02_05_2026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://demoqa.com/alerts");
		
		d1.findElement(By.id("alertButton")).click();
		
		Alert al = d1.switchTo().alert();
		
		al.accept();
		
		d1.findElement(By.id("confirmButton")).click();
		
		Alert a2 = d1.switchTo().alert();
		
		a2.dismiss();
		
		d1.findElement(By.id("promtButton")).click();
		
		Alert a3 = d1.switchTo().alert();
		
		a3.sendKeys("Test User");
		
		a3.accept();
		
		

	}

}
