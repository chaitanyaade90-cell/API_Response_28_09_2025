package Dropdownhandeling_11_04_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("htttps://example.com");
		
		Select dropdown = new Select(d1.findElement(By.id("country")));
		
		dropdown.selectByVisibleText("India");
		

	}

}
