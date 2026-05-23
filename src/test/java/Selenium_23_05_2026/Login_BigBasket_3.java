package Selenium_23_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test

public class Login_BigBasket_3 {
	
	public void BigB() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://www.bigbasket.com");
		
		d1.findElement(By.xpath("//*[@id='headlessui-menu-button-:Rld956:']/div/span[2]")).click();
		
		d1.findElement(By.xpath("//*[@id='siteLayout']/header[2]/div[1]/div[1]/div/div/div/div/input]")).click();

		d1.findElement(By.xpath("//*[@id=\'siteLayout\']/header[2]/div[2]/div[2]/ul/li[1]/a/span]")).click();
	}

}
