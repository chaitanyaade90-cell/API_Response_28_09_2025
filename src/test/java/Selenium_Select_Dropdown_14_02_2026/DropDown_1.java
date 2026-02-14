package Selenium_Select_Dropdown_14_02_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.facebook.com");
		
		Select dropdown = new Select(d1.findElement(By.id("Country")));
		
		dropdown.selectByVisibleText("India");
		

	}

}
