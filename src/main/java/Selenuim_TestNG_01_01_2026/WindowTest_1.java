package Selenuim_TestNG_01_01_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		String parent = d1.getWindowHandle();
		
		d1.findElement(By.id("windowButton")).click();
		
		for (String win : d1.getWindowHandles()) {
			
			if(!win.equals(parent));
			d1.switchTo().window(win);
			System.out.println(d1.getCurrentUrl());
			
			d1.switchTo().window(parent);
			
		}

	}

}
