package Package_02_05_2026;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instance_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.google.com");
		
		System.out.println(d1.getTitle());
		
		

	}

}
