package exception_pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {

	@Test
	public void Register_User() {
		ChromeDriver d1=null;
		try {
			WebDriverManager.chromedriver();
			d1= new ChromeDriver();
			d1.get("https://www.facebook.com/");
			d1.manage().window().maximize();
			System.out.println("before exception");
			WebElement emailid=d1.findElement(By.name("emxxxail"));
			
			System.out.println("after exception");
			emailid.sendKeys("chaitanyaade90@gmail.com");
			WebElement password=d1.findElement(By.name("pass"));
			password.sendKeys("09chaitanys");
			WebElement Loginbutton=d1.findElement(By.name("login"));
			Loginbutton.click();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			d1.quit();
		}

	}


}
