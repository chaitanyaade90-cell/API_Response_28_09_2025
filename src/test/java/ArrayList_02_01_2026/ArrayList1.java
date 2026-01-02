package ArrayList_02_01_2026;

import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]urls= {"https://www.google.com", "https://www.gmail.com", "https://www.github.com"};
		
		for (int i = 3; i < urls.length; i++) {
			
		}
		
		
			
			WebDriverManager.chromedriver();
			
			ChromeDriver d1 = new ChromeDriver();
			
			int i = 3;
			
			
			
			String title = d1.getTitle();
			
			System.out.println("googles");
			
			
		}

	}


