package ScrollDown_07_11_2025;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDPage_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.example.com/");
		
		JavascriptExecutor js= (JavascriptExecutor)d1;
		js.executeScript("window.scrollBy (0,500)");
		
		System.out.println("Page download successfully");

	}

}
