package WaitExample_19_04_2026;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Waitexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d1.findElement(By.id("login")).click();
		
		

	}

}
