package core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Dimension;
import java.time.Duration;
public class selenium4 {
    public static void main(String[] args) {
        System.out.println("Starting Chrome Browser...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
            // 1. setViewport (width: 966, height: 677)
            driver.manage().window().setSize(new Dimension(966, 677));
            // 2. navigate to BigBasket
            System.out.println("Navigating to BigBasket...");
            driver.get("https://www.bigbasket.com/");
            // 3. assertEvent (Verify Title)
            String expectedTitle = "Online Grocery Shopping and Online Supermarket in India - bigbasket";
            if (driver.getTitle().contains("bigbasket")) {
                System.out.println("Successfully navigated to BigBasket. Title matched.");
            } else {
                System.out.println("Title did not match. Current title: " + driver.getTitle());
            }
            // Note: The "click" action is missing the target element in your JSON snippet.
            // You can add it here once you know the element's locator. Example:
            // driver.findElement(By.cssSelector(".some-class")).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.err.println("Error during execution: " + e.getMessage());
        } finally {
            System.out.println("Quitting the browser...");
            if (driver != null) {
                driver.quit();
            }
        }
    }
}