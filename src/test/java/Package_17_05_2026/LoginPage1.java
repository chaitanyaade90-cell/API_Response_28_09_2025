package Package_17_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

@Test

public class LoginPage1 {
	
	public void Login() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver().setup();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://dribbble.com/shots/25339477-HR-Platform-Register-Page");
		
		d1.findElement(By.xpath("/html/body/div[8]/div[1]/div[1]/div[1]/div/div[2]/div[1]/div/div/a/'img']"));

	}

}
