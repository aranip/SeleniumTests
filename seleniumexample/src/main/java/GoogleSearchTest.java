import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  //maximize window
        driver.manage().deleteAllCookies();  //delete all cookies

                driver.get("https://www.google.com");
                driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("test");
         List<WebElement> list  = driver.findElements(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[2]/div[2]/ul"));//li/descendant::div[@class='sbl1']"));
        System.out.println("Total no. of suggestions in search list : "+ list.size());  //*[@id="tsf"]/div[2]/div[1]/div[2]/div[2]/ul
for(int i = 0; i< list.size(); i++){
    System.out.println(list.get(i).getText());              ////ul[@role='listbox' and @class='erkvQe']
    if(list.get(i).getText().contains("testing")){
        list.get(i).click();
        break;
    }


}
    }
}
