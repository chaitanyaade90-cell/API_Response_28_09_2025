package HiddenElements_02_01_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_elements_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.github.com");
		
		WebElement element = d1.findElement(By.id("hiddenButton"));
		
		boolean status = element.isDisplayed();
		
		System.out.println(status);

	}

}
