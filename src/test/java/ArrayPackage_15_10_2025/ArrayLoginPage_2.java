package ArrayPackage_15_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayLoginPage_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]urls= {"https://www.google.com/", "https://www.amazon.com/", "https://www.facebook.com/"};
		
		for (int i = 0; i < urls.length; i++) {
			
			WebDriverManager.chromedriver();
			
			ChromeDriver d1=new ChromeDriver();
			
			d1.get(urls[i]);
			d1.manage().window().maximize();
			
			String title=d1.getTitle();
			
			System.out.println("Website found");
			
		}

	}

}
