package Package_26_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Icici_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://www.icici.bank.in/personal-banking/ways-to-bank/net-banking");
		
		d1.findElement(By.xpath("//*[@id='loandetailspage-427d2d232a']")).click();
		
		d1.findElement(By.xpath("//*[@id='login']")).click();
		
		d1.findElement(By.xpath("//*[@id='container-c7fda8f9ed']/div/div[1]/div/div/article/div/div[1]/div[1]/div/ul/li[2]/a/span")).click();

	}

}
