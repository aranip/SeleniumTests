import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BootstrapDropBoxHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  //maximize window
        driver.manage().deleteAllCookies();  //delete all cookies

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

        //button[contains(@class,'multiselect-selected-text')]
        driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button")).click();
       List<WebElement> list =  driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
        System.out.println(list.size());

        for(int i =0; i< list.size();i++) {
            System.out.println(list.get(i).getText());
            list.get(i).click();
        }

      /*  for(int i =0; i< list.size();i++){
            System.out.println(list.get(i).getText());
        if(list.get(i).getText().contains("Angular")){
            list.get(i).click();
            break;
        }
        } */
    }

    }
