package LoginE2E_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginE2E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.example.com");
		
		d1.findElement(By.id("username")).sendKeys("admin");
		
		d1.findElement(By.id("password")).sendKeys("1233");
		
		d1.findElement(By.id("login")).click();
		
		String title = d1.getTitle();
		
		if (title.contains("Dashboard")) {
			System.out.println("Login Succesfull");
			
		} else {
			System.out.println("Login failed");

		}

	}

}
