package Selenium_07_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_1 {

	private static WebElement emaild;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://www.facebook.com/");
		
		d1.manage().window().maximize();
		WebElement emailid=d1.findElement(By.name("mail"));
		
		emaild.sendKeys("chaitanyaade90@gmail.com");
		
		WebElement password=d1.findElement(By.name("pass"));
		password.sendKeys("09chaitanys");
		
		WebElement loginButton=d1.findElement(By.name("login"));
		loginButton.click();
		
		

	}

}
