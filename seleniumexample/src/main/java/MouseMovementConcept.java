import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseMovementConcept {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.childrensplace.com/us/home");
        Thread.sleep((3000));
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        //Alert alert = driver.switchTo().alert();

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Girl"))).build().perform();

        driver.findElement(By.id("id=\'list-item-420015\'"));
        driver.close();
        driver.quit();
    }
}
