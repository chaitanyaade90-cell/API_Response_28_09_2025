package Xpath_03_01_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("C:ChaitanyaAdeeclipse_workspace");
		
		d1.manage().window().maximize();
		
		d1.findElement(By.xpath("//input[@id='user_name']"));
		sendKeys("admin");
		
		d1.findElement(By.xpath("//input[@name='password']"));
		sendKeys("admin123");
		
		d1.findElement(By.xpath("//button[@text()='Login']"));
		click();
		

	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

	private static void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
