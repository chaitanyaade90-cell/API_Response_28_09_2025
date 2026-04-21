package AlertExample_21_04_2026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Alert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		Alert alert = d1.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();

	}

}
