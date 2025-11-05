package ArrayPackage_05_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Array_2 {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]urls= {"https://www.googel.com/","https://www.facebook.com/","https://www.github.com"};
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get(urls[i]);
		
		String title=d1.getTitle();
		
		if(title.equals("googles"));
		
		System.out.println("found google");
		
		

	}

}
