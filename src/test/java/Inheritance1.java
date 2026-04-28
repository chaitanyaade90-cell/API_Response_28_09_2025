import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Inheritance1 {
	
	class BaseTest
	{
		
		public void Setup() {
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.examples.com");
		
		System.out.println("Browser Launched");

	}

}
