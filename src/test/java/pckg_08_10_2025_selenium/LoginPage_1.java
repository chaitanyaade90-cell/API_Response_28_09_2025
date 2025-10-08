package pckg_08_10_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://www.facebook.com/");
		
		d1.manage().window().maximize();
		
		WebElement emailid=d1.findElement(By.name("email"));
		
		emailid.sendKeys("chaitanyaade90@gmail.com");
		
		WebElement password= d1.findElement(By.name("pass"));
		
		password.sendKeys("09chaitanys");
		
		WebElement loginbutton=d1.findElement(By.name("login"));
		
		loginbutton.click();
		
		

	}

}
