package NewResponse_06_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1= new ChromeDriver();
		
		d1.get("https://www.gmail.com/");
		
		WebElement mailid=d1.findElement(By.name("mail"));
		mailid.sendKeys("chaitanyaade90@gmail.com");
		
		WebElement password=d1.findElement(By.name("pass"));
		password.sendKeys("chaitu@1234");
		
	}

}
