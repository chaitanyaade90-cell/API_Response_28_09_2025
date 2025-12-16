import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenim2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1=new ChromeDriver();
		
		d1.get("https://www.gmail.com/");
		d1.manage().window().maximize();
		
		WebElement emailid=d1.findElement(By.name("email"));
		
		emailid.sendKeys();
		
		WebElement password=d1.findElement(By.name("password"));
		password.sendKeys("chaitu@1234");
		
		WebElement loginid=d1.findElement(By.name("login"));
		loginid.click();
		

	}

}
