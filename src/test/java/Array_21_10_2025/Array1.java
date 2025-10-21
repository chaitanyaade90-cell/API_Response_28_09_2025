package Array_21_10_2025;

import java.lang.reflect.Array;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Array1 {
	
	public static void main(String[] args) {
		
		String[]urls= {"https://www.google.com/", "https://www.facebook.com", "https://www.github.com/"};
		
		for (int i = 0; i < urls.length; i++) {
			
			WebDriverManager.chromedriver();
			
			ChromeDriver d1= new ChromeDriver();
			
			d1.get(urls[i]);
			
			d1.manage().window().maximize();
			
			String title=d1.getTitle();
			
			if(title.equals("google"));
			
			System.out.println("WebSites douns");
					
			
		}
		
	}

}
