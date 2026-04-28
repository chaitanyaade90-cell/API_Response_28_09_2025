package Package_28_04_2026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.example.com");
		
		Alert alert = d1.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		alert.dismiss();
		
		

	}

}
