package DoLoop_01_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loopwebsites_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]websites= {
				"https://www.google.com",
	            "https://www.facebook.com",
	            "https://www.amazon.com",
	            "https://www.youtube.com",
	            "https://www.linkedin.com"
		};
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		for (int i = 0; i < websites.length; i++) {
			
			System.out.println("website : " + websites[i]);
			System.out.println("Title :  " + d1.getTitle());
			
		}
		

	}

}
