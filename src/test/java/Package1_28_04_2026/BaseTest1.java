package Package1_28_04_2026;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class BestTest
{
	public void Service() {
		
		System.out.println("My bike is HeroVida");
	}
}

public class BaseTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.example.com");
		
		System.out.println("Bike ride on Battery");

	}

}
