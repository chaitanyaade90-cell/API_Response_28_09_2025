package SeleniumPackage_27_06_2026;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {

	private static final By loginBtn = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		
		d1.get("https://www.lambdatest.com/learning-hub/selenium");
		
		d1.findElement(By.id("username")).sendKeys("user");
		
		d1.findElement(By.id("password")).sendKeys("pass");
		
		
		((RemoteWebDriver) d1.findElement(loginBtn)).close();
		
		File src = ((TakesScreenshot) d1).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("Screenshot.png"));
		
		
		

	}

}
