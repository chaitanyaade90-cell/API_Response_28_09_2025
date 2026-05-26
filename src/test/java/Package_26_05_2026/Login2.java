package Package_26_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.tjmaher.com/p/media.html");
		
		d1.manage().window().maximize();
		
		d1.findElement(By.xpath("//*[@id='PageList2']/div/ul/li[1]/a")).click();
		
		d1.findElement(By.xpath("//*[@id='PageList2']/div/ul/li[2]/a")).click();
		
		d1.findElement(By.xpath("//*[@id='PageList2']/div/ul/li[4]/a")).click();
		
		d1.quit();

	}

}
