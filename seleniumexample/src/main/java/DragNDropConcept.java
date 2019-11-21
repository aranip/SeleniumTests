import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDropConcept {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  //maximize window
        driver.manage().deleteAllCookies();  //delete all cookies

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);

        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//*[@id=\'draggable\']")))
                .moveToElement(driver.findElement(By.xpath("//*[@id=\'droppable\']")))
                .release()
                .build()
                .perform();
driver.quit();




    }
}
