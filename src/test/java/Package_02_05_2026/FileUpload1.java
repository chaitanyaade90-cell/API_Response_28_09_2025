package Package_02_05_2026;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver();
		
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://www.amazon.com");
		
		d1.findElement(By.id("uploadBtn")).click();
		
		StringSelection file = new StringSelection("C:\\testfile.txt");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, file);
		
		Robot robot = new Robot();
		
		

	}

}
