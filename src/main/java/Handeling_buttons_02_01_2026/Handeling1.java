package Handeling_buttons_02_01_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handeling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.gmail.com");
		
		WebElement username = d1.findElement(By.name("user"));
		
		username.sendKeys("abc@gmail.com");
		
		WebElement heading = d1.findElement(By.className("_8eso"));
		
		String headingvalue = heading.getText();
		System.out.println(headingvalue);

	}

}
