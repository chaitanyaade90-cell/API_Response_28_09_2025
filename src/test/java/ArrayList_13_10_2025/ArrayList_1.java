package ArrayList_13_10_2025;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]urls= {"https://www.google.com","https://www.facebook.com","https://www.youtube.com","https://www.amazon.in"};



		for (int i = 0; i < urls.length; i++) {

			WebDriverManager.chromedriver();

			ChromeDriver d1=new ChromeDriver();

			d1.get(urls[i]);
			d1.manage().window().maximize();
			String title=d1.getTitle();

			if(title.equals("Google")) {
				System.out.println("website found");
			}

			d1.quit();
		}
		
		//repeat same logic with arraylist
		List<String> website_urls=new ArrayList<String>();
		website_urls.add("https://www.google.com");
		for (int i = 0; i < website_urls.size(); i++) {
			System.out.println(website_urls.get(i));
			
		}




	}

}
