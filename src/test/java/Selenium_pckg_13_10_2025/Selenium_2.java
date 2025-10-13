package Selenium_pckg_13_10_2025;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1= new ChromeDriver();
		
		d1.get("https://www.facebook.com/");
		
		d1.manage().window().maximize();
		
		WebElement emailid=d1.findElement(By.name("email"));
		emailid.sendKeys("chaitanyaade90@gmail.com");
		
		WebElement password=d1.findElement(By.name("pass"));
		password.sendKeys("09chaitanys");
		
		WebElement loginbutton=d1.findElement(By.name("login"));
		
		loginbutton.click();
		
		
		
		File f=((TakesScreenshot) d1).getScreenshotAs(OutputType.FILE);
	    Files.copy(f, new File("C:\\Users\\admin\\eclipse-workspace\\NEW_DEL_PROJECT\\screenshot\\screenshotexcelr.jpg"));
        
		
		
		
		

	}

}
