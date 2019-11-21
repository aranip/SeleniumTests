

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year= driver.findElement(By.id("year"));
		
		Select select = new Select(day);
		
		//select.deselectByIndex(10);
		select.selectByVisibleText("10");
		
		System.out.println(select.isMultiple());
		
		List<WebElement> listDays = select.getOptions();
		System.out.println(listDays.size());
		int TotalDays = listDays.size()-1;
		System.out.println(TotalDays);
		
		for(int i=0; i<listDays.size(); i++){
			String dayVal = listDays.get(i).getText();
			System.out.println(dayVal);
			if(dayVal.equals("15")){
				listDays.get(i).click();
				break;
			}
		}
		
		
	}

}
