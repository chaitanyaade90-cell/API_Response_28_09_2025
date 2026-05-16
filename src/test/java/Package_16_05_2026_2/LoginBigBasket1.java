package Package_16_05_2026_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBigBasket1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver d1 = new ChromeDriver();
		
		
		
		d1.manage().window().maximize();
		
		d1.get("https://www.bigbasket.com/");
		
		d1.findElement(By.id("username")).sendKeys("chaitanya");
		
		d1.findElement(By.id("password")).sendKeys("12345");
		
		d1.findElement(By.id("loginButton"));
		
		d1.findElement(By.xpath("//*['@id='siteLayout']/header[2]/div[1]/div[2]/div[2]/'button']"));
		
		d1.findElement(By.xpath("//*[@id='7897261']"));
		
		d1.findElement(By.xpath("//*['@id='siteLayout']/header[2]/div[1]/div[1]/div/div/div/div/'input']"));
		
		d1.findElement(By.xpath("//*[@id='headlessui-menu-button-:r3:']/svg/g/path']"));
		
		d1.quit();
		

	}

}
