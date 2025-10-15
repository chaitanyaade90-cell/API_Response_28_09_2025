package Selenium_Project_15_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();

		ChromeDriver d1=new ChromeDriver();

		// Array of Websites

		String[]Websites= {

				"https://www.google.com",
				"https://www.facebook.com",
				"https://www.amazon.in",
				"https://www.wikipedia.org",
				"https://www.youtube.com"		


		};
		
		//Loop through each websites
		
		for (int i = 0; i < Websites.length; i++) {
			
			d1.get(Websites[i]);
			d1.manage().window().maximize();
			
			// wait for 2 second
			
			Thread.sleep(2000);
			
			// print title
			
			System.out.println("Websites : " + Websites [i]);
			System.out.println("Title : " + d1.getTitle());
			
			// 
		}



	}

}
