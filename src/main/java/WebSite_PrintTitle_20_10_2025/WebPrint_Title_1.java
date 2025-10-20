package WebSite_PrintTitle_20_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPrint_Title_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1= new ChromeDriver();
		
		// Array of website 
		
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
			
			Thread.sleep(2000);
			
			System.out.println("Website: " + websites[i]);
			System.out.println("Title : " + d1.getTitle());
			System.out.println("_____________");
			
			
			
		}

	}

}
