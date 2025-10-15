package Selenium_Project_15_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenuim_5 {

	private static int i;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		// Arrays of Websites
		
		String[]Websites = {
			
			"https://www.google.com",
            "https://www.facebook.com",
            "https://www.amazon.in",
            "https://www.wikipedia.org",
            "https://www.youtube.com"
			
		};
		
		for (int i = 0; i < Websites.length; i++) {
			d1.get(Websites[i]);
			
		}
		
		
			
			//Wait for Second
		    
		    Thread.sleep(2000);
		    
		    // Print Title
		    
		    System.out.println("Websites : " + Websites[i]);
		    System.out.println("title : " + d1.getTitle());
		}
		

	}


