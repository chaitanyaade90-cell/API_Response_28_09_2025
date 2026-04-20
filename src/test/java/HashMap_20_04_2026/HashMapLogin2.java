package HashMap_20_04_2026;

import java.util.HashMap;

import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapLogin2 {

	private static final String TestData = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.example.com");
		
		d1.findElement(By.id("username"));
		sendKeys(Data.getInstance(d1));
}

	private static void sendKeys(Data instance) {
		// TODO Auto-generated method stub
		
	}

}
