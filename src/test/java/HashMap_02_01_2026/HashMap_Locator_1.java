package HashMap_02_01_2026;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMap_Locator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		HashMap<String, By>  locators = new HashMap<>();
		
		locators.put("username",By.id("username"));
		locators.put("password", By.id("password"));
		

	}

}
