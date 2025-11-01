package ArrayPackage_31_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]urls= {"https://www.google.com/", "https://www.facebook.com/"};
		
		for (int i = 0; i < urls.length; i++) {
			
			ChromeDriver d1=new ChromeDriver();
			
			d1.manage().window().maximize();
			
			d1.get(urls[i]);
			
			String titleString=d1.getTitle();
			
			
			
			System.out.println("Found Google");
			
			
			
		}

	}

}
