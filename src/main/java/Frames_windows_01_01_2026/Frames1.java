package Frames_windows_01_01_2026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		String parentWindow = d1.getWindowHandle();
		
		for(String win : d1.getWindowHandles()) {
		
			if(!win.equals(parentWindow)) {
				
				WebDriver window = d1.switchTo().window(parentWindow()); {
					
					d1.switchTo().window(win);
				}
			}
		}

	}

	private static String parentWindow() {
		// TODO Auto-generated method stub
		return null;
	}

}
