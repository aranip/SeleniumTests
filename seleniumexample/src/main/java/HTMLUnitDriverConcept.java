import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class HTMLUnitDriverConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new HtmlUnitDriver();
        driver.manage().window().maximize();  //maximize window
        driver.manage().deleteAllCookies();  //delete all cookies

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://freecrm.com/"); //enter the url
        System.out.println("Befor login Title is : "+driver.getTitle());
        driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
        driver.findElement(By.name("email")).sendKeys("chitramale345@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Intelli321");
        driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]")).click();
        //Thread.sleep(3000);
        System.out.println("After login Title is :" +driver.getTitle());
    }
}
