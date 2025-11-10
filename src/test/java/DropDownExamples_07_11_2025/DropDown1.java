package DropDownExamples_07_11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1= new ChromeDriver();
		
		d1.get("https://www.facebook.com/");
		d1.manage().window().maximize();
		
		
		WebElement dropcountry = d1.findElement(By.name("birthday_day"));
		Select drocountry.selectByVisibleText("2");
		
		
		

	}

	private static void selectByVisibleText(String string) {
		// TODO Auto-generated method stub
		
	}

}
