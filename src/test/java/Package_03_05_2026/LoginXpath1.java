package Package_03_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginXpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.bigbasket.com/");
		
		d1.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		d1.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
		
		d1.findElement(By.xpath("//button[text()='Login']")).click();
		
		String title = d1.getTitle();
		
		if(title.contains("DashBoard")) {
			
			System.out.println("Login Succesfull");
		
		}else {
			System.out.println("Login Failed");
		}
	

	}

}
