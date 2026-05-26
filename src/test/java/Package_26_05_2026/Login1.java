package Package_26_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 {

    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Chrome Browser
        ChromeDriver d1 = new ChromeDriver();

        // Maximize Browser
        d1.manage().window().maximize();

        // Open Website
        d1.get("https://www.tjmaher.com/p/all-posts.html");

        // Wait for 3 seconds
        Thread.sleep(3000);

        // Click on Home Link
        d1.findElement(By.linkText("Home")).click();

        // Wait for 3 seconds
        Thread.sleep(3000);

        // Close Browser
        
    }
}