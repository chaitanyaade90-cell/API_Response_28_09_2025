package XpathPackage_05_11_2025;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathClass_1 {
	
	//Absolute Xpath (Full Xpath)
	// Starts with /
	
	//Relative Xpath (Partial Xpath)
	// Reletive Xpath start with // 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.manage().window().maximize();
		d1.get("https://www.demowebshop.tricentis.com/");

	}

}
