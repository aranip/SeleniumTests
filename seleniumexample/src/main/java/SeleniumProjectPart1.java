import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumProjectPart1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();  //maximize window
        driver.manage().deleteAllCookies();  //delete all cookies

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("http://ecommerce.saipratap.net/");
        driver.findElement(By.linkText("ACCOUNT")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("SignUp")).click();
        Thread.sleep(1000);
        WebElement radio1 =	driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/form/table/tbody/tr[5]/td/table/tbody/tr[1]/td[4]/input[2]"));
        if(!radio1.isSelected())
        {
            radio1.click();
        }
        Thread.sleep(1000);
        //radio1.click();
        driver.findElement(By.id("fname")).sendKeys("chitra");
        Thread.sleep(1000);
        driver.findElement(By.id("lname")).sendKeys("ragha");
        Thread.sleep(1000);
        driver.findElement(By.name("day")).sendKeys("12");
        Thread.sleep(1000);
        driver.findElement(By.name("month")).sendKeys("12");
        Thread.sleep(1000);
        driver.findElement(By.name("year")).sendKeys("1989");
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("chitraragha@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("houseno")).sendKeys("19-4-513");
        Thread.sleep(1000);
        driver.findElement(By.name("add1")).sendKeys("capitol avenue");
        Thread.sleep(1000);
        driver.findElement(By.name("city")).sendKeys("sanjose");
        Thread.sleep(1000);
        driver.findElement(By.name("state")).sendKeys("CA");
        Thread.sleep(1000);
        driver.findElement(By.id("postcode")).sendKeys("95113");
        Thread.sleep(1000);
        driver.findElement(By.name("phone")).sendKeys("6547658765");
        Thread.sleep(1000);
        driver.findElement(By.name("fax")).sendKeys("54326");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("chitra121");
        Thread.sleep(1000);
        driver.findElement(By.name("cpassword")).sendKeys("chitra121");
        Thread.sleep(1000);
        boolean b1 = driver.findElement(By.id("terms")) .isSelected();
        System.out.println(b1);  //false
        driver.findElement(By.id("terms")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Submit")).click();
        System.out.println("Thank you for signing up. Your account is now created and you can log in by clicking the ACCOUNT button in the main menu above.");
    }
}
