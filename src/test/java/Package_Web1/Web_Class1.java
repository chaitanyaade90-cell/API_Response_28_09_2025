package Package_Web1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Class1 {
	
	ChromeDriver d1=null;

	public  void  Launchbrowser() {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		 d1=new ChromeDriver();
		
		
		
		

	}
	
	public void CloseBrowser() {
		
	
		
		d1.quit();
	}
	
	public void Navigate() {
		
		d1.get("https://www.google.com/");
	}

}
