package ArrayList_13_10_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]urls= {"https://www.google.com","https://www.facebook.com","https://www.youtube.com","https://www.amazon.in"};
        
		for (int i = 0; i < 5; i++) {
			
			WebDriverManager.chromedriver();
			
			ChromeDriver d1=new ChromeDriver();
			
			d1.get(urls[i]);
			d1.manage().window().maximize();
			System.out.println(d1.getTitle());
			d1.quit();
			
			
			
		}
	}

}
