package Package_25_04_2026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://demoqa.com/alerts");
		
		d1.findElement(By.id("alertButton")).click();
		
		Alert alert = d1.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();

	}

}
