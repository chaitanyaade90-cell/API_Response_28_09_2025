package Package_02_05_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullAlertException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
			
			d1.get("https://demoqa.com/alerts");
			
			WebDriverWait wait = new WebDriverWait(d1,Duration.ofSeconds(10));
		
		
		
		
			
			
		
		 
			
			
		}
		
		
		
		
		

	}

}
