import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ToDoMVC {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://todomvc4tasj.herokuapp.com");
        //public static void Title(int val) {
         //   String title = String.valueOf(val);
        String deleteTheItem = "facebook";
        WebElement textbox = driver.findElement(By.id("new-todo"));
        textbox.sendKeys("google");
            Thread.sleep(2000);
        textbox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        new Actions(driver).moveToElement(textbox).click().perform();

        textbox.sendKeys("facebook");
            Thread.sleep(2000);
        textbox.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
        textbox.sendKeys("apple");
        Thread.sleep(2000);
        textbox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        //delete facebook by taking facebook
        List<WebElement> allElements = driver.findElements(By.xpath("//*[@id='todo-list']/li"));
        for(WebElement element: allElements){
            System.out.println(element.getText());
        }
        Thread.sleep(4000);
        //delete facebook
        int index = 0;

        for(int i=0; i< allElements.size(); i++){
            if(allElements.get(i).getText().equals(deleteTheItem)){
                index = i+1;
            }
        }
        driver.findElement(By.xpath("//*[@id='todo-list']/li["+index+"]/div/input")).sendKeys(Keys.SPACE);
       // driver.close();
        Thread.sleep(2000);
       WebElement button = driver.findElement(By.xpath("//*[@id='todo-list']/li["+index+"]/div/button"));
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@id='todo-list']/li["+index+"]/div/label")))
                .moveToElement(button).click().build().perform();
Thread.sleep(2000);
driver.close();
//        driver.findElement(By.xpath("//*[@id=\'new-todo\']")).sendKeys(Keys.RETURN);
       // }
       // public static void listelements(int val){
       //     String title = Integer.toString(val);
         //driver.findElement(By.xpath("//*[@id=\'new-todo\']")).click();
//       driver.findElement(By.xpath("//*[@id='todo-list']/li[2]/div/input")).isSelected();

       // }
    }
}