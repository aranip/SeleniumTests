package com.qa.FirefoxLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class FirefoxLaunch {

	static WebDriver driver;
	public static  void main(String [] args){
	
		 if(Constants.browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/amruthapenigalapati/Downloads/chromedriver");
	        driver = new ChromeDriver(); 
		}
		 else if(Constants.browserName.equals("firefox")){
					
					//WebDriver driver = new FirefoxDriver();
					System.setProperty("webdriver.gecko.driver", "/Users/amruthapenigalapati/Downloads/geckodriver");
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					 driver = new FirefoxDriver(capabilities); 
					 
					 
					}
		driver.get("http://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("Page title is :" +title);
		driver.close();
		
		
	
	}
}
