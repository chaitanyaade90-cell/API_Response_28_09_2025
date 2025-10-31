package ArrayPackage_31_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]urls= {"https://www.google.com", "https://www.facebook.com/","https://www.github.com"};
		
		for (int i = 0; i < urls.length; i++) {
			
			WebDriverManager.chromedriver();
			
			ChromeDriver d1=new ChromeDriver();
			
			d1.manage().window().maximize();
			
			d1.get(urls[i]);
			
			String title=d1.getTitle();
			
			if(title.equals("Google"));
			
			System.out.println("Websites found");
			
			
			
			
		}

	}

}
