package ScreenShotsExamples_22_10_2025;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://www.google.com");
		
		d1.manage().window().maximize();
		
		// Take Screenshots and store it as a file format
		
		File src= ((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Screenshots\\google.png");
		
		FileUtils.copyFile(src, dest);
		
		System.out.println("Screenshots saved succesfully!");

	}

}
