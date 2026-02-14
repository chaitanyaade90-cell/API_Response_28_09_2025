package SendTextExamples_14_02_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendText2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.gmail.com");
		
		d1.findElement(By.name("q")).sendKeys("Selenium Automation");
		
		d1.quit();
	}

}
