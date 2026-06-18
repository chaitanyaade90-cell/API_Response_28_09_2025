package Package_26_05_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Icici_Login {

    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Browser
        ChromeDriver d1 = new ChromeDriver();

        // Maximize Browser
        d1.manage().window().maximize();

        // Open Website
        d1.get("https://www.icici.bank.in/personal-banking/ways-to-bank/net-banking");

        // Wait
        Thread.sleep(3000);

        // Click First Button
        d1.findElement(By.xpath("//*[@id='loandetailspage-427d2d232a']")).click();

        Thread.sleep(3000);

        // Click Login
        d1.findElement(By.xpath("//*[@id='login']")).click();

        Thread.sleep(3000);

        // Click Menu Option
        d1.findElement(By.xpath("//*[@id='container-c7fda8f9ed']/div/div[1]/div/div/article/div/div[1]/div[1]/div/ul/li[2]/a/span")).click();

        Thread.sleep(3000);

        // Close Browser
        
    }
}