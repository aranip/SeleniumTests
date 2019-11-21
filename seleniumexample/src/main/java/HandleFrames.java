import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandleFrames {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();  //maximize window
        driver.manage().deleteAllCookies();  //delete all cookies

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//frame has 2 properties 1.index and 2. name
        driver.get("https://freecrm.com/"); //enter the url
        String s1 = driver.getTitle();
        System.out.println(s1);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
        driver.findElement(By.name("email")).sendKeys("chitramale345@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Intelli321");
        driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]")).click();
       String s = driver.getTitle();
        System.out.println(s);
        Thread.sleep(5000);
        driver.findElement(By.linkText("Home")).click();
        String s3 = driver.getTitle();
        System.out.println(s3);
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.xpath("//*[@id=\'dashboard-toolbar\']/div[2]/div/a/button")).click();

        //driver.switchTo().frame("mainpanel");
//*[@id="dashboard-toolbar"]/div[2]/div/a
    }
}
