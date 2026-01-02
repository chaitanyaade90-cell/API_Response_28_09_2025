package HashMap_02_01_2026;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.gmail.com");
		
		HashMap<String, String> loginData = new HashMap<>();
		
		loginData.put("admin", "admin123");
		loginData.put("user", "user123");
		
		d1.findElement(By.id("username"));
		sendkeys(loginData.get("admin"));
		
		d1.findElement(By.id("loginBtn")).click();
		
		

	}

	private static void sendkeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
