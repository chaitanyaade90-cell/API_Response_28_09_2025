package Package_02_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import groovyjarjarantlr4.v4.codegen.model.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Button1 {

	private static WebElement doubleBtn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.manage().window().maximize();
		
		d1.get("https://demoqa.com/buttons");
		
		WebDriverWait wait = (WebDriverWait) d1.findElement(By.id("doubleClickBtn"));
		
		Actions act = new Actions(d1);
		
		act.doubleClick(doubleBtn).perform();

	}

}
