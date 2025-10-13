package Selenium_pckg_13_10_2025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://demoqa.com/alerts");
		
		WebElement simple=d1.findElement(By.id("alertbutton"));
		simple.click();
		Thread.sleep(2000);
		Alert confirmalert=d1.switchTo().alert();
		confirmalert.dismiss();
		
		WebElement prompt=d1.findElement(By.id("promptButton"));
		prompt.click();
		Thread.sleep(2000);
		Alert promptalert=d1.switchTo().alert();
		promptalert.sendKeys("Excelr Solution");
		promptalert.accept();
		
		

	}

}
