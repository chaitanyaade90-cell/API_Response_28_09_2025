package Package_03_05_2026;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotFail1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.saucedemo.com/");
		
		try {
			d1.findElement(By.id("wrong")).click();
		
		}catch (Exception e) {
			
			TakesScreenshot ts = (TakesScreenshot) d1;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(src, new File("error.png"));
			
			System.out.println("Screenshots taken on failure");
		}
		
		

	}

}
