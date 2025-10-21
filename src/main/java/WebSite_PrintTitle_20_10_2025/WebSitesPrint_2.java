package WebSite_PrintTitle_20_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class WebSitesPrint_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		//Arrays of WebSites
		
		String[]websites= {
				"https://www.google.com",
	            "https://www.facebook.com",
	            "https://www.amazon.in",
	            "https://www.wikipedia.org",
	            "https://www.youtube.com"
				
				
		};
		
		for (int i = 0; i < websites.length; i++) {
			
			d1.get(websites[i]);
			d1.manage().window().maximize();
			
			
		}
		

	}

}
