import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		
		driver.findElement(new ByAll(By.name("firstname"),By.id("u_0_j"),By.xpath("//input[@name= 'firstname']"))).sendKeys("chitra");
       // driver.findElement(By.xpath("//*[@id='u_0_14']")).sendKeys("female321$3");
       //driver.findElement(new ByIdOrName("firstname")).sendKeys("chitra");
       driver.findElement(new ByChained(By.id("u_0_j"),By.xpath("//input[@name= 'firstname']"),
    		   By.name("firstname")  )).sendKeys("chitra");
	}

}
