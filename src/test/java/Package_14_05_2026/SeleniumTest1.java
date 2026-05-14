package Package_14_05_2026;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		List<WebElement> links = (List<WebElement>) d1.findElement(By.tagName("a"));
		
		for(WebElement link : links) {
			
			System.out.println(link.getText());
		}

	}

}
