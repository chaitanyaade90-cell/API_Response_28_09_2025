package Package_15_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://the-internet.herokuapp.com/upload");
		
		d1.findElement(By.id("file-upload")).sendKeys("C:\\test\\demo.pdf");
		
		d1.findElement(By.id("file-submit")).click();
		
		System.out.println("File upload succesfully");
		
		

	}

}
