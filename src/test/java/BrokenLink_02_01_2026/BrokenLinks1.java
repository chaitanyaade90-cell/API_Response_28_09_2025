package BrokenLink_02_01_2026;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.gmail.com");
		
		WebElement links = d1.findElement(By.tagName("aa"));
		
		
			
			String url = links.getAttribute("href");
			
			if(url==null) url.isEmpty();
		}
			
		
		
		

	}


