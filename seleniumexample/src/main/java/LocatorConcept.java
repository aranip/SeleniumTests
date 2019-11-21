import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorConcept {

    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("chitramale345@gmail.com");
        driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("female321$");
       driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
        //driver.quit();

    }

}
