package ArrayPackage_15_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayLoginPage_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]urls= {"https://www.facebook.com/", "https://www.amazon.com/", "https://youtube.com/"};
		
		for (int i = 0; i < urls.length; i++) {
			
			WebDriverManager.chromedriver();
			
			ChromeDriver d1=new ChromeDriver();
			
			d1.get(urls[i]);
			
			String title=d1.getTitle();
			
			if(title.equals("Googel"));
			
			System.out.println("website found");
			
		}

	}

}
