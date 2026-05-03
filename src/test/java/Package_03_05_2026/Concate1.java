package Package_03_05_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Concate1 {

	private static CharSequence email;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d1.get("https://demoqa.com/automation-practice-form");
		
		// Dynamic Data
		
		
		String firstName = "Chaitanya";
		String lastName = "Ade";
        String gender = "Male";
        String hobby1 = "Sports";
        String hobby2 = "Music";
        String state = "NCR";
        String city = "Delhi";
        
        d1.findElement(By.id("firstName")).sendKeys(firstName);
        d1.findElement(By.id("lastName")).sendKeys("lastName");
        
        System.out.println("Entered Name: " + firstName + " " + lastName);
        
        // Email
        String email = firstName = "@gmail.com";
        d1.findElement(By.id("userEmail")).sendKeys(email);
		
		

	}

}
