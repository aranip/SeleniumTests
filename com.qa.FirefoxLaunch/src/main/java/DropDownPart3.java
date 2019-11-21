import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPart3 {
	 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
		 driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		
		String month_xpath = "//select[@id='month']//option";
		String year_xpath = "//select[@id='year']//option";
		String day_xpath = "//select[@id='day']//option";
		
		selectDropDown(month_xpath, "Feb");
		selectDropDown(year_xpath, "1995");
		selectDropDown(day_xpath, "18");
	}

	public static void selectDropDown(String xpathValue, String value){
		List<WebElement> monthlist = driver.findElements(By.xpath(xpathValue));
		System.out.println(monthlist.size());
		
		for(int i =0; i< monthlist.size(); i++){
			System.out.println(monthlist.get(i).getText());
			if(monthlist.get(i).getText().equals(value)){
				monthlist.get(i).click();
				break;
			}
		}
	}
}
