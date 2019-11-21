
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DynamicWebTableHandle {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver(); //launch chrome

        driver.manage().window().maximize(); //maximize window
        driver.manage().deleteAllCookies(); //delete all the cookies

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.freecrm.com");
        System.out.println("Befor login Title is : " + driver.getTitle());
        driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
        driver.findElement(By.name("email")).sendKeys("chitramale345@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Intelli321");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]")).click();
        //driver.findElement(By.xpath("//input[@type='submit']")).click();

        //driver.switchTo().frame("mainpanel");
        Thread.sleep(200);

        driver.findElement(By.xpath("//*[@id=\'main-nav\']/a[3]/span")).click();


        //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
        //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]


        //Method-1:
        String before_xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
        String after_xpath = "]/td[2]";

        for(int i=1; i<=4; i++){
            String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
            System.out.println(name);
         if(name.contains("test2 test2")){ //i=6
               //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[1]/div/label
               //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[1]/div/input
              // driver.findElement(By.xpath("//input[@class ='hidden' and @name = 'id' and type = 'checkbox']//parent : :before //preceding-sibling : : after")).click();
                driver.findElement(By.xpath("//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]/div")).click();
            }
        }

        //Method-2:
       // driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
       // driver.findElement(By.xpath("//a[contains(text(),'nara pen')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();


        driver.findElement(By.xpath("//*[@id=\'dashboard-toolbar\']/div[2]/div/a/button")).click();

        driver.findElement(By.name("first_name")).sendKeys("brad");
        driver.findElement(By.name("last_name")).sendKeys("neil");
        driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div/div[1]/input")).sendKeys("bradneil@gmail.com");
        driver.findElement(By.name("position")).sendKeys("Manager");
        driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();




    }

}