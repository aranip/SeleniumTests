package WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {
WebDriver driver;
	@BeforeMethod
	public void setup(){
		//WebDriverManager.chromedriver().setup();
//		WebDriverManager.operadriver().setup();
//		WebDriverManager.phantomjs().setup();
//		WebDriverManager.edgedriver().setup();
//		WebDriverManager.iedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void freeCRMTest(){
		driver.get("http://www.freecrm.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
