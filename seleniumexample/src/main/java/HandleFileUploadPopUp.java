import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://html.com/input-type-file/");
        driver.findElement(By.name("fileupload")).sendKeys("/Users/amruthapenigalapati/Documents/palindrome.py");

    }
}