import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream ip = new FileInputStream("/Users/amruthapenigalapati/Downloads/seleniumexample/src/main/java/config.properties");
        prop.load(ip);

        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("age"));
        String url = prop.getProperty("URL");
        System.out.println(url);
        String browser = prop.getProperty("browser");
        System.out.println(browser);

        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
             driver = new ChromeDriver();
        }
        else if(browser.equals("FF")){
            System.setProperty("webdriver.firefox.driver", "/Users/amruthapenigalapati/Downloads/geckodriver");
            driver = new FirefoxDriver();
        }
        driver.get(url);
        driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
        driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
    }
}
