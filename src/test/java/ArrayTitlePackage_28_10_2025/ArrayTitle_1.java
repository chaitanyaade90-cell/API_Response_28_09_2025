package ArrayTitlePackage_28_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayTitle_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]websites= {"https://www.google.com/","https://www.gmail.com/"};
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		String[]expectedTitles= {
				"Google",
				"Facebook-Log in or sign up"
		};
		
		for (int i = 0; i < websites.length; i++) {
			
			d1.get(websites[i]);
			System.out.println("Websites: " + expectedTitles[i]);
			String actualTitle = null;
			System.out.println("Actual : " + actualTitle);
			
			if(actualTitle.equals(expectedTitles[i])) {
				System.out.println("Title matched");
				
			}else {
				System.out.println("Title mismatch");
			}
			
		}

	}

}
