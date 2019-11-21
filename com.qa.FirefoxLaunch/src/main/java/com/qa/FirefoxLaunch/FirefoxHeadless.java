package com.qa.FirefoxLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxHeadless {

	static WebDriver driver;
	public static void main(String [] args) {
		
		FirefoxBinary firefoxbinary = new FirefoxBinary();
		firefoxbinary.addCommandLineOptions("--headless");
		System.setProperty("webdriver.gecko.driver", "/Users/amruthapenigalapati/Downloads/geckodriver");
		
		 FirefoxOptions fo = new FirefoxOptions();
		 fo.setBinary(firefoxbinary);
		 driver = new FirefoxDriver(fo);
		 
		 driver.get("http://www.facebook.com");
			String title = driver.getTitle();
			System.out.println("title is :" +title);
			driver.close();
		
	}
}
