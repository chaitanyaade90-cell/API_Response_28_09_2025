package Package_03_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.google.com");
		
		WebElement element = d1.findElement(By.id("country"));
		
		Select dropdown = new Select(element);
		
		dropdown.selectByVisibleText("India");
		
		String selected = dropdown.getFirstSelectedOption().getText();
		
		if(selected.equals("India")) {
			System.out.println("Dropdown Working");
		}
		
		for(WebElement opt : dropdown.getOptions()) {
			
			System.out.println(opt.getText());
		}
		
		

	}

}
