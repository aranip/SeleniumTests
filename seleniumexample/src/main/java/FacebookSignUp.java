import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\'u_0_s\']")).sendKeys("chitra");
        driver.findElement(By.xpath("//*[@id=\'u_0_u\']")).sendKeys("malepati");
        driver.findElement(By.xpath("//*[@id=\'u_0_x\']")).sendKeys("chitramale345@gmail.com");
        driver.findElement(By.xpath("//*[@id='u_0_14']")).sendKeys("female321$3");
       //handle dropbox
        Select select = new Select(driver.findElement(By.id("month")));
        select.selectByVisibleText("Oct");
        Select s1 = new Select(driver.findElement(By.name("birthday_day")));
        s1.selectByVisibleText("7");
        Select s2 = new Select(driver.findElement(By.name("birthday_year")));
        s2.selectByVisibleText("1988");
        // driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
        //driver.quit();

    }
}
