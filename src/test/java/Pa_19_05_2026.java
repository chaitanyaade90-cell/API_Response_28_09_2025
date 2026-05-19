import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pa_19_05_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://practicetestautomation.com/practice-test-login/");
		
		d1.findElement(By.xpath("//*[@id='username']")).sendKeys("student");
		
		d1.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
		
		d1.findElement(By.xpath("//*[@id='submit']")).click();
		
		
	}

}
