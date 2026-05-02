package Package_02_05_2026;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.oxford.com");
		
	}
	
	public void teardown() {
		
		
	}

}
