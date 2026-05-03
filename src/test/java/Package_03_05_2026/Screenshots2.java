package Package_03_05_2026;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot) d1;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("screenshot.png"));
		
		

	}

}
