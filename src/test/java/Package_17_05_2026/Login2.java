package Package_17_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

@Test
public class Login2 {
	
	public void Log2() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://dribbble.com/shots/26724325-Payoneer-App-Web-Redesign");
		
		d1.findElement(By.xpath("//*[@id='pswp__items']/div[2]/div/'img']"));
		
		d1.findElement(By.xpath("/html/body/div[22]/section/div[1]/div[2]/div/'img']"));
		
		d1.findElement(By.xpath("//*[@id='details,]/div[16]/section/div[2]/'button'[2]"));
		
		d1.findElement(By.xpath("//*[@id='pswp__items']/div[2]/div]"));
		
		d1.findElement(By.id("loginButton")).sendKeys("login");
		
		
		
		d1.quit();
		
		

	}

}
