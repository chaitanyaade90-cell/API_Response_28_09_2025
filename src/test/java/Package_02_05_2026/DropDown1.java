package Package_02_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://demoqa.com/alerts");
		
		WebElement dropdown = d1.findElement(By.id("country"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("India");
		
		select.selectByValue("IN");
		
		select.selectByIndex(1);
		

	}

}
