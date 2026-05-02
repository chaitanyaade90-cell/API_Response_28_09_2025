package Package_01_05_2026;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.example.com"); 
		
		List<WebElement> options = d1.findElements(d1, null, null);
		
		By.xpath("//select[@id='country'/option");
		
		for(WebElement opt : options) {
			
			System.out.println(opt.getText());
		}
		

	}

}
