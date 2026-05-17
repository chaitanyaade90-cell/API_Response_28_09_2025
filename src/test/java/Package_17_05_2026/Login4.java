package Package_17_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

@Test
public class Login4 {
	
	public void Log4() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get(("https://demoqa.com/automation-practice-form"));
		
		d1.manage().window().maximize();
		
		d1.findElement(By.id("firstName")).sendKeys("Chaitanya");
		
		d1.findElement(By.id("lastName")).sendKeys("Ade");
		
		d1.findElement(By.id("userEmail")).sendKeys("chaitanyaade90@gmail.com");
		
		d1.quit();

	}

}
