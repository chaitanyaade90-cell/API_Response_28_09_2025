package Package_17_05_2026_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HospitalLogin1 {
	
	public void Doctor() {
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		Thread.sleep(3000);
		
		d1.get("https://poonahospital.org/");
		
		d1.findElement(By.linkText("Find Doctor")).click();
		
		WebElement doctoreSearch= d1.findElement(By.name("doctorname"));
		
		d1.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/div[2]/div[1]/'b']"));
		
		d1.findElement(By.xpath("//*[@id='panel-w6891f7894d3f2-0-0-0']/div/div/a/div[2]")).click();
		
		d1.quit();
		
		
		
		
		
		
		d1.findElement(By.xpath("//*[@id='page']/div[2]/div/'select']")).click();

	}

}
