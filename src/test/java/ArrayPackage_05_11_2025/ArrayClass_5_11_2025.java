package ArrayPackage_05_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayClass_5_11_2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]urls= {"https://www.gmail.com/","https://www.google.com/","https://www.facebook.com"};
         
		for (int i = 0; i < urls.length; i++) {
			
			WebDriverManager.chromedriver();
			
			ChromeDriver d1=new ChromeDriver();
			
			d1.get(urls[i]);
			
			String title=d1.getTitle();
			
			if(title.equals("googles"));
			
			System.out.println("Found Websites");
			
			
		}
	}

}
