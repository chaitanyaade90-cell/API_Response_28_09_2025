package Package_02_05_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d1.get("https://demoqa.com/automation-practice-form");
		
		WebDriverWait wait = new WebDriverWait(d1,Duration.ofSeconds(10));
		
		d1.findElement(By.id("firstName")).sendKeys("Chaitanya");
		
		d1.findElement(By.id("lastName")).sendKeys("Ade");
		
		d1.findElement(By.id("userEmail")).sendKeys("testgmail.com");
		
		d1.findElement(By.id("userNumber")).sendKeys("9130839142");
		
		WebElement male = d1.findElement(By.xpath("//label[text()='Male']"));
		
		

	}

}
