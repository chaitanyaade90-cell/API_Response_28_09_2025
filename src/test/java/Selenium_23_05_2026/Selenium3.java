package Selenium_23_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium3 {
	
	public void login3() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriverManager.chromedriver();
		
		  ChromeOptions options = new ChromeOptions();
	        ChromeDriver driver = new ChromeDriver(options);
	        
	        
	        	 
	            try {
	                // Step 1: Set viewport
	                driver.manage().window().setSize(new org.openqa.selenium.Dimension(966, 662));
	                
	                // Step 2: Navigate to URL
	                driver.navigate().to("https://demoqa.com/nestedframes");
	                Thread.sleep(2000); // Wait for page to load
	                
	                // Step 3: Click on "Text Box" link
	                WebElement textBoxLink = driver.findElement(By.xpath("//*[@id=\"item-0\"]/a/span"));
	                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", textBoxLink);
	                Thread.sleep(500);
	                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", textBoxLink);
	                Thread.sleep(1000);
	                
	                // Step 4: Click on Full Name field
	                driver.findElement(By.id("userName")).click();
	                Thread.sleep(500);
	                
	                // Step 5: Enter Full Name
	                driver.findElement(By.id("userName")).sendKeys("isahn");
	                Thread.sleep(500);
	                
	                // Step 6: Click on Email field
	                driver.findElement(By.id("userEmail")).click();
	                Thread.sleep(500);
	                
	                // Step 7: Enter Email
	                driver.findElement(By.id("userEmail")).sendKeys("ishan@gmail.com");
	                Thread.sleep(500);
	                
	                // Step 8: Click on Current Address field
	                driver.findElement(By.id("currentAddress")).click();
	                Thread.sleep(500);
	                
	                // Step 9: Enter Current Address
	                driver.findElement(By.id("currentAddress")).sendKeys("pune");
	                Thread.sleep(500);
	                
	                // Step 10: Click on Permanent Address field
	                driver.findElement(By.id("permanentAddress")).click();
	                Thread.sleep(500);
	                
	                // Step 11: Enter Permanent Address
	                driver.findElement(By.id("permanentAddress")).sendKeys("pune");
	                Thread.sleep(500);
	                
	                System.out.println("Test completed successfully!");
	                
	            } catch (Exception e) {
	                System.out.println("Error occurred: " + e.getMessage());
	                e.printStackTrace();
	            } finally {
	                // Close the browser
	                driver.quit();
	            }

	        }
	        }

	


