package SignUp_project_22_04_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.examples.com/signup");
		
		d1.findElement(By.id("name")).sendKeys("chaitanya");
		
		d1.findElement(By.id("email")).sendKeys("chaitanyaade90@gmail.com");
		
		d1.findElement(By.id("male")).click();

	}

}
