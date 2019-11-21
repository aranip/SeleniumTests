import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleWindowPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  //maximize window
        driver.manage().deleteAllCookies();  //delete all cookies

        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://www.popuptest.com/");
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[5]/b/a")).click();
        driver.findElement(By.xpath("//html/body/table[2]/tbody/tr/td/b/font/b/a")).click();
        Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();

        String parentWindowId = it.next();
        System.out.println("parent window id :" +parentWindowId);

        String childWindowId = it.next();
        System.out.println("Child window id :" +childWindowId);
        driver.switchTo().window(childWindowId);
        System.out.println("childWindow pop up title" +driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindowId);
        System.out.println("parentWindow pop up title" +driver.getTitle());

        }


    }

