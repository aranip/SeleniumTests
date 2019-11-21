import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor {

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

        driver.get("https://www.freecrm.com");
        System.out.println("Befor login Title is : " + driver.getTitle());
        driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
        driver.findElement(By.name("email")).sendKeys("chitramale345@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Intelli321");
        //driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]")).click();
        //Thread.sleep(3000);
        WebElement Login = driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]"));
        flash(Login, driver);

    }

    public static void flash(WebElement element, WebDriver driver) {
        JavaScriptExecutor js = ((JavaScriptExecutor) driver);
        String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 100; i++) {
            changeColor("rgb(0,200,0)", element, driver);
            changeColor(bgcolor, element, driver);
        }
    }

        public static void changeColor(String color, WebElement element, WebDriver driver ){
        JavaScriptExecutor js = ((JavaScriptExecutor)driver);
        js.executeScript("arguments[0].style.backgroungColor = '"+color+"'" , element);
    try {
        Thread.sleep(20);
    }
    catch (InterruptedException e) {
    }
    }

    private void executeScript(String color, WebElement element) {
    }


}

