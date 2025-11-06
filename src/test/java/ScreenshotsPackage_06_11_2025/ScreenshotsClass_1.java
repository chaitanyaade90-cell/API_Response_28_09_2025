package ScreenshotsPackage_06_11_2025;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsClass_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://demowebshop.tricentis.com/");
		d1.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)d1;
		File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\java\\Screenshots\\capture.png");
		Sourcefile.renameTo(targetfile);
		Thread.sleep(2000);
		d1.quit();
		
		

	}

}
