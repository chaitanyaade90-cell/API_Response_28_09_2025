package Package_03_05_2026;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listner1 {

	private static Object result;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.amazon.com/");
		
		TakesScreenshot ts = (TakesScreenshot) d1;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("fail_" + ((File) result).getName() + ".png"));
		
		

	}

}
