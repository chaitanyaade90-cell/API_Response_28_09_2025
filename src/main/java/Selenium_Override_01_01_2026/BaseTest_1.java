package Selenium_Override_01_01_2026;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		System.out.println("Launching default browser");
		
		}

	private RemoteWebDriver d1;
	
	    public void openurl() {
	    	System.out.println("Opening default URL");
	    	
	    	d1.get("https://www.github.com");
	    }
	    

}
