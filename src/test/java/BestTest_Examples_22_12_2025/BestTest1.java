package BestTest_Examples_22_12_2025;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BestTest1 {
	
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	

	

	}


