package SeleniumPackage_27_06_2026;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenPage {
	
	@Test
	public void Openpage() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://www.mahadiscom.in/");
		
		System.out.println(d1.getCurrentUrl());
		
		d1.quit();
		

	}

}
