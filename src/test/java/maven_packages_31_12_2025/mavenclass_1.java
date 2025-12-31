package maven_packages_31_12_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.api.logs.Logger;

public class mavenclass_1 {

	private static final String logger = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.get("https://www.gmail.com");

	}

}
