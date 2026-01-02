package keyworddriven_02_01_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keywordDriven_1 {

	private static RemoteWebDriver d1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		}
	     
	    public static void openUrl(String Url) {
	    	d1.get(Url);
	    }
	    
	    public static void typetext(String locatorType, String locator, String value) {
	    	By by = getBy(locatorType, locator);
	    	
	    	d1.findElement(by).click();
	    }

		private static By getBy(String locatorType, String locator) {
			// TODO Auto-generated method stub
			return null;
		}

}
