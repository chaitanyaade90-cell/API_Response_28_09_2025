package ScrollingPackage_06_11_2025;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingExmClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://demowebshop.tricentis.com/");
		d1.manage().window().maximize();
		
		//By pixel
		JavascriptExecutor js=(JavascriptExecutor)d1;
		js.executeAsyncScript("window.scrollBy(0,1500)","" );
		System.out.println(js.executeAsyncScript);
		

	}

}
