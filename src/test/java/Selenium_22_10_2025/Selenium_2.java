package Selenium_22_10_2025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://demoqa.com/alerts");
		
		WebElement simple=d1.findElement(By.id("alertButton"));
		simple.click();
		Thread.sleep(2000);
		Alert simplealert=d1.switchTo().alert();
		simplealert.accept();
		
		WebElement confirm=d1.findElement(By.id("confirmButton"));
		confirm.click();
		Thread.sleep(2000);
		Alert Confirmalert=d1.switchTo().alert();
		Confirmalert.dismiss();
		
		WebElement prompt=d1.findElement(By.id("promptButton"));
		prompt.click();
		Thread.sleep(2000);
		Alert promptalert=d1.switchTo().alert();
		promptalert.sendKeys("EXCELR SOLUTION");
		promptalert.accept();

	}

}
