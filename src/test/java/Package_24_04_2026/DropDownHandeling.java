package Package_24_04_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		Select Dropdown = new Select(d1.findElement(By.id("country")));
		
		Dropdown.selectByVisibleText("India");
		
		Dropdown.selectByValue("In");
		
		Dropdown.selectByIndex(1);

	}

}
