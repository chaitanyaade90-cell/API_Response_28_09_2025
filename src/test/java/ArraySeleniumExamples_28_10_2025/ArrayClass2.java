package ArraySeleniumExamples_28_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]websites= {"https://www.amazon.com/","https://www.google.com/","https://facebook.com/"};
        
		WebDriverManager.chromedriver();
		
		ChromeDriver d1= new ChromeDriver();
		
		for (int i = 0; i < websites.length; i++) {
			
			d1.get(websites[i]);
			d1.manage().window().maximize();
			
			System.out.println("Websites: " +websites[i]);
			System.out.println("Title: " + d1.getTitle());
			
			
		}
	}

}
