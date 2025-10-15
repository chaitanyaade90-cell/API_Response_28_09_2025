package Selenium_Project_15_10_2025;

import java.util.Iterator;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTitle_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		// Arrys of Websites
		
		String[]Websites= {
				
				"https://www.google.com",
	            "https://www.facebook.com",
	            "https://www.amazon.in",
	            "https://www.wikipedia.org",
	            "https://www.youtube.com"
		};
		
		 for (int i = 0; i < Websites.length; i++) {
			 d1.get(Websites[i]);
			 d1.manage().window().maximize();
			 
			 // Wait for Secod
			 
			 Thread.sleep(2000);
			 
			 //Print Title
			 
			 System.out.println("Websites : " + Websites[i]);
			 System.out.println("title : " + d1.getTitle());
			
		}

	}

}
