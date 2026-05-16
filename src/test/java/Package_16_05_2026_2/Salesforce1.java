package Package_16_05_2026_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Salesforce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://login.salesforce.com/");
		
		d1.manage().window().maximize();
		
		d1.findElement(By.id("username")).sendKeys("chaitanya");
		
		d1.findElement(By.xpath("//*['@id='username']"));
		
		d1.findElement(By.id("password")).sendKeys("12345");
		
		d1.findElement(By.xpath("//*[@id='password']"));
		
		d1.findElement(By.xpath("//*[@id='Login']"));
		
		d1.quit();
		
		

	}

}
